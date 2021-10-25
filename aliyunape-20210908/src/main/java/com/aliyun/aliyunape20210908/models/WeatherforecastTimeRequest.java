// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeatherforecastTimeRequest extends TeaModel {
    // UserId
    @NameInMap("UserId")
    public Long userId;

    // 用户中心--我的订单--订单请求--实例名称：aliyunape_meteor12_public_cn-0ju2d2hh90b
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 经度，范围为（70°E~139.96°E）
    @NameInMap("Lon")
    public String lon;

    // 20210809090000
    @NameInMap("CurHour")
    public String curHour;

    // 纬度，范围为（15°N~59.95°N
    @NameInMap("Lat")
    public String lat;

    public static WeatherforecastTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        WeatherforecastTimeRequest self = new WeatherforecastTimeRequest();
        return TeaModel.build(map, self);
    }

    public WeatherforecastTimeRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public WeatherforecastTimeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WeatherforecastTimeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WeatherforecastTimeRequest setLon(String lon) {
        this.lon = lon;
        return this;
    }
    public String getLon() {
        return this.lon;
    }

    public WeatherforecastTimeRequest setCurHour(String curHour) {
        this.curHour = curHour;
        return this;
    }
    public String getCurHour() {
        return this.curHour;
    }

    public WeatherforecastTimeRequest setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

}
