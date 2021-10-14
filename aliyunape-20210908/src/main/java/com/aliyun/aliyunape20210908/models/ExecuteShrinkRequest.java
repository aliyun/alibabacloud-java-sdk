// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ExecuteShrinkRequest extends TeaModel {
    // appName
    @NameInMap("AppName")
    public String appName;

    // source
    @NameInMap("Channel")
    public String channel;

    // extendParam
    @NameInMap("ExtendParam")
    public String extendParamShrink;

    // orderId
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // serviceParam
    @NameInMap("ServiceParam")
    public String serviceParamShrink;

    // aliyunPk
    @NameInMap("UserId")
    public Long userId;

    public static ExecuteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteShrinkRequest self = new ExecuteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecuteShrinkRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
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

    public ExecuteShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteShrinkRequest setServiceParamShrink(String serviceParamShrink) {
        this.serviceParamShrink = serviceParamShrink;
        return this;
    }
    public String getServiceParamShrink() {
        return this.serviceParamShrink;
    }

    public ExecuteShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
