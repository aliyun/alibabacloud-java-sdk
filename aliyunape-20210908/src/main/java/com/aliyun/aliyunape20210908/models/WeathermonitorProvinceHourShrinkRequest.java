// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeathermonitorProvinceHourShrinkRequest extends TeaModel {
    // appName
    @NameInMap("AppName")
    public String appName;

    // 渠道名称
    @NameInMap("Channel")
    public String channel;

    // 扩展参数
    @NameInMap("ExtendParam")
    public String extendParamShrink;

    // orderId
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 请求参数
    @NameInMap("ServiceParam")
    public String serviceParamShrink;

    // UserId
    @NameInMap("UserId")
    public Long userId;

    public static WeathermonitorProvinceHourShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        WeathermonitorProvinceHourShrinkRequest self = new WeathermonitorProvinceHourShrinkRequest();
        return TeaModel.build(map, self);
    }

    public WeathermonitorProvinceHourShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public WeathermonitorProvinceHourShrinkRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public WeathermonitorProvinceHourShrinkRequest setExtendParamShrink(String extendParamShrink) {
        this.extendParamShrink = extendParamShrink;
        return this;
    }
    public String getExtendParamShrink() {
        return this.extendParamShrink;
    }

    public WeathermonitorProvinceHourShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WeathermonitorProvinceHourShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WeathermonitorProvinceHourShrinkRequest setServiceParamShrink(String serviceParamShrink) {
        this.serviceParamShrink = serviceParamShrink;
        return this;
    }
    public String getServiceParamShrink() {
        return this.serviceParamShrink;
    }

    public WeathermonitorProvinceHourShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
