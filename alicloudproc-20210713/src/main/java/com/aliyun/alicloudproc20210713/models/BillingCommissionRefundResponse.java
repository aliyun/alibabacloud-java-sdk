// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCommissionRefundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BillingCommissionRefundResponseBody body;

    public static BillingCommissionRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        BillingCommissionRefundResponse self = new BillingCommissionRefundResponse();
        return TeaModel.build(map, self);
    }

    public BillingCommissionRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BillingCommissionRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BillingCommissionRefundResponse setBody(BillingCommissionRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public BillingCommissionRefundResponseBody getBody() {
        return this.body;
    }

}
