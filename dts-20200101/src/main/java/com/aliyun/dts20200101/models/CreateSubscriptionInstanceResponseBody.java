// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateSubscriptionInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public String success;

    @NameInMap("ErrCode")
    public String errCode;

    public static CreateSubscriptionInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionInstanceResponseBody self = new CreateSubscriptionInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubscriptionInstanceResponseBody setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public CreateSubscriptionInstanceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateSubscriptionInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateSubscriptionInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
