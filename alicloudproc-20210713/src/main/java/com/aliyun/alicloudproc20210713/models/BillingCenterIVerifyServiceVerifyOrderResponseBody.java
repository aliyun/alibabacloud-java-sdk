// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCenterIVerifyServiceVerifyOrderResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("synchro")
    public String synchro;

    public static BillingCenterIVerifyServiceVerifyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BillingCenterIVerifyServiceVerifyOrderResponseBody self = new BillingCenterIVerifyServiceVerifyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public BillingCenterIVerifyServiceVerifyOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BillingCenterIVerifyServiceVerifyOrderResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BillingCenterIVerifyServiceVerifyOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BillingCenterIVerifyServiceVerifyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BillingCenterIVerifyServiceVerifyOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BillingCenterIVerifyServiceVerifyOrderResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

}
