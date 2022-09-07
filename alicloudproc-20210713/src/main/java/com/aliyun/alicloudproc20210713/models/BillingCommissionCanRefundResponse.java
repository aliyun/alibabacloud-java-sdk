// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCommissionCanRefundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BillingCommissionCanRefundResponseBody body;

    public static BillingCommissionCanRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        BillingCommissionCanRefundResponse self = new BillingCommissionCanRefundResponse();
        return TeaModel.build(map, self);
    }

    public BillingCommissionCanRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BillingCommissionCanRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BillingCommissionCanRefundResponse setBody(BillingCommissionCanRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public BillingCommissionCanRefundResponseBody getBody() {
        return this.body;
    }

}
