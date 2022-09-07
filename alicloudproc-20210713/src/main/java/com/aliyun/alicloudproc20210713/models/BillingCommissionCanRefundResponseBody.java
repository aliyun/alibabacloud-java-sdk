// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCommissionCanRefundResponseBody extends TeaModel {
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

    public static BillingCommissionCanRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BillingCommissionCanRefundResponseBody self = new BillingCommissionCanRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public BillingCommissionCanRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BillingCommissionCanRefundResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BillingCommissionCanRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BillingCommissionCanRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BillingCommissionCanRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BillingCommissionCanRefundResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

}
