// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ExecuteShrinkRequest extends TeaModel {
    // aliyunPk
    @NameInMap("UserId")
    public Long userId;

    // serviceParam
    @NameInMap("ServiceParam")
    public String serviceParamShrink;

    // extendParam
    @NameInMap("ExtendParam")
    public String extendParamShrink;

    // orderId
    @NameInMap("OrderId")
    public String orderId;

    // appName
    @NameInMap("AppName")
    public String appName;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // source
    @NameInMap("Channel")
    public String channel;

    public static ExecuteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteShrinkRequest self = new ExecuteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ExecuteShrinkRequest setServiceParamShrink(String serviceParamShrink) {
        this.serviceParamShrink = serviceParamShrink;
        return this;
    }
    public String getServiceParamShrink() {
        return this.serviceParamShrink;
    }

    public ExecuteShrinkRequest setExtendParamShrink(String extendParamShrink) {
        this.extendParamShrink = extendParamShrink;
        return this;
    }
    public String getExtendParamShrink() {
        return this.extendParamShrink;
    }

    public ExecuteShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecuteShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecuteShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteShrinkRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
