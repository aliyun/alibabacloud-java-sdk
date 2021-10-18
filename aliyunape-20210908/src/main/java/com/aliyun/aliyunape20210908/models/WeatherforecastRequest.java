// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeatherforecastRequest extends TeaModel {
    // UserId
    @NameInMap("UserId")
    public Long userId;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // yyyymmdd080000或yyyymmdd200000
    @NameInMap("StartForecast")
    public String startForecast;

    // 经度，范围为（70°E~139.96°E）
    @NameInMap("Lon")
    public String lon;

    // 纬度，范围为（15°N~59.95°N）
    @NameInMap("Lat")
    public String lat;

    public static WeatherforecastRequest build(java.util.Map<String, ?> map) throws Exception {
        WeatherforecastRequest self = new WeatherforecastRequest();
        return TeaModel.build(map, self);
    }

    public WeatherforecastRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public WeatherforecastRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WeatherforecastRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WeatherforecastRequest setStartForecast(String startForecast) {
        this.startForecast = startForecast;
        return this;
    }
    public String getStartForecast() {
        return this.startForecast;
    }

    public WeatherforecastRequest setLon(String lon) {
        this.lon = lon;
        return this;
    }
    public String getLon() {
        return this.lon;
    }

    public WeatherforecastRequest setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

}
