// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ExecuteRequest extends TeaModel {
    // aliyunPk
    @NameInMap("UserId")
    public Long userId;

    // serviceParam
    @NameInMap("ServiceParam")
    public java.util.Map<String, String> serviceParam;

    // extendParam
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

    // source
    @NameInMap("Channel")
    public String channel;

    public static ExecuteRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequest self = new ExecuteRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ExecuteRequest setServiceParam(java.util.Map<String, String> serviceParam) {
        this.serviceParam = serviceParam;
        return this;
    }
    public java.util.Map<String, String> getServiceParam() {
        return this.serviceParam;
    }

    public ExecuteRequest setExtendParam(java.util.Map<String, String> extendParam) {
        this.extendParam = extendParam;
        return this;
    }
    public java.util.Map<String, String> getExtendParam() {
        return this.extendParam;
    }

    public ExecuteRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecuteRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecuteRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
