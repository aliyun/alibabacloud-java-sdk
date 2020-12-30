// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindSubscriptionResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChargeId")
    public String chargeId;

    @NameInMap("Code")
    public String code;

    public static UnbindSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindSubscriptionResponseBody self = new UnbindSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindSubscriptionResponseBody setChargeId(String chargeId) {
        this.chargeId = chargeId;
        return this;
    }
    public String getChargeId() {
        return this.chargeId;
    }

    public UnbindSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
