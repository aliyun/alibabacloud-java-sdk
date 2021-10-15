// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeathermonitorProvinceHourRequest extends TeaModel {
    // appName
    @NameInMap("AppName")
    public String appName;

    // 渠道名称
    @NameInMap("Channel")
    public String channel;

    // 扩展参数
    @NameInMap("ExtendParam")
    public java.util.Map<String, String> extendParam;

    // orderId
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 请求参数
    @NameInMap("ServiceParam")
    public java.util.Map<String, String> serviceParam;

    // UserId
    @NameInMap("UserId")
    public Long userId;

    public static WeathermonitorProvinceHourRequest build(java.util.Map<String, ?> map) throws Exception {
        WeathermonitorProvinceHourRequest self = new WeathermonitorProvinceHourRequest();
        return TeaModel.build(map, self);
    }

    public WeathermonitorProvinceHourRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public WeathermonitorProvinceHourRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public WeathermonitorProvinceHourRequest setExtendParam(java.util.Map<String, String> extendParam) {
        this.extendParam = extendParam;
        return this;
    }
    public java.util.Map<String, String> getExtendParam() {
        return this.extendParam;
    }

    public WeathermonitorProvinceHourRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WeathermonitorProvinceHourRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WeathermonitorProvinceHourRequest setServiceParam(java.util.Map<String, String> serviceParam) {
        this.serviceParam = serviceParam;
        return this;
    }
    public java.util.Map<String, String> getServiceParam() {
        return this.serviceParam;
    }

    public WeathermonitorProvinceHourRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
