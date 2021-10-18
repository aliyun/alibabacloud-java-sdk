// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeathermonitorProvinceHourRequest extends TeaModel {
    // UserId
    @NameInMap("UserId")
    public Long userId;

    // 请求参数
    @NameInMap("ServiceParam")
    public java.util.Map<String, String> serviceParam;

    // 扩展参数
    @NameInMap("ExtendParam")
    public java.util.Map<String, String> extendParam;

    // orderId
    @NameInMap("OrderId")
    public String orderId;

    // appName
    @NameInMap("AppName")
    public String appName;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 渠道名称
    @NameInMap("Channel")
    public String channel;

    public static WeathermonitorProvinceHourRequest build(java.util.Map<String, ?> map) throws Exception {
        WeathermonitorProvinceHourRequest self = new WeathermonitorProvinceHourRequest();
        return TeaModel.build(map, self);
    }

    public WeathermonitorProvinceHourRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public WeathermonitorProvinceHourRequest setServiceParam(java.util.Map<String, String> serviceParam) {
        this.serviceParam = serviceParam;
        return this;
    }
    public java.util.Map<String, String> getServiceParam() {
        return this.serviceParam;
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

    public WeathermonitorProvinceHourRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public WeathermonitorProvinceHourRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WeathermonitorProvinceHourRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
