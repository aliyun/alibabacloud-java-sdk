// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindSubscriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ChargeId")
    @Validation(required = true)
    public String chargeId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static UnbindSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSubscriptionResponse self = new UnbindSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSubscriptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindSubscriptionResponse setChargeId(String chargeId) {
        this.chargeId = chargeId;
        return this;
    }
    public String getChargeId() {
        return this.chargeId;
    }

    public UnbindSubscriptionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindSubscriptionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
