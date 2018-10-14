package com.sunshine.util;

import java.math.BigDecimal;

/**
 * Bigdecimal操作工具类
 * @author zxz
 * @date 2018-10-14
 */
public class BigdecimalUtil {
    public static BigDecimal check(Object o){
        if (null!=o){
            if (o instanceof  BigDecimal){
                if(((BigDecimal) o).compareTo(BigDecimal.ZERO)==0){
                    return new BigDecimal("0");
                }else {
                    return (BigDecimal)o;
                }
            }
        }
        return new BigDecimal("0");
    }
}
