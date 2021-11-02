// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeatherforecastRequest extends TeaModel {
    // 纬度，范围为（15°N~59.95°N）
    @NameInMap("Lat")
    public String lat;

    // 经度，范围为（70°E~139.96°E）
    @NameInMap("Lon")
    public String lon;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    // yyyymmdd080000或yyyymmdd200000
    @NameInMap("StartForecast")
    public String startForecast;

    public static WeatherforecastRequest build(java.util.Map<String, ?> map) throws Exception {
        WeatherforecastRequest self = new WeatherforecastRequest();
        return TeaModel.build(map, self);
    }

    public WeatherforecastRequest setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public WeatherforecastRequest setLon(String lon) {
        this.lon = lon;
        return this;
    }
    public String getLon() {
        return this.lon;
    }

    public WeatherforecastRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WeatherforecastRequest setStartForecast(String startForecast) {
        this.startForecast = startForecast;
        return this;
    }
    public String getStartForecast() {
        return this.startForecast;
    }

}
