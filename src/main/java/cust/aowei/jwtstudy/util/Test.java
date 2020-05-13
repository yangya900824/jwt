package cust.aowei.jwtstudy.util;

import io.jsonwebtoken.Claims;

public class Test {

    public static void main(String[] args) throws Exception{
        Claims claims = JwtUtils.parseJwt("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJ5YW5neWEiLCJzdWIiOiJ5YW5neWEiLCJpYXQiOjE1ODkzNTUwODUsInJvbGVzIjoiYWxsLWFkbWluIiwiZXhwIjoxNTg5MzU1MTg1fQ.oeDumfY3qAPlTUNHAUHxg4SclsF6-h8GJ66OaR87ej8");
        System.out.println(claims);
    }
}
