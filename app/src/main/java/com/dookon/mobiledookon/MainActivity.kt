package com.dookon.mobiledookon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import com.dookon.mobiledookon.R.id.fragment_container
import com.dookon.mobiledookon.R.id.navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation = findViewById<BottomNavigationView>(navigation)
        navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId){
                R.id.navigation_chat -> {
                    loadFragment(ChatFragment())
                }
                R.id.navigation_comment -> {
                    loadFragment(CommentFragment())
                }
                R.id.navigation_product -> {
                    loadFragment(ProductFragment())
                }
                R.id.navigation_sale -> {
                    loadFragment(SaleFragment())
                }
                else -> {
                    loadFragment(ProductFragment())
                }

            }
        }

        loadFragment(ProductFragment())


    }


    fun loadFragment(fragment : Fragment) : Boolean{
        if(fragment != null){
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
            return true
        }
        return false
    }




}

