// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCommissionPayOrderCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BillingCommissionPayOrderCallbackResponseBody body;

    public static BillingCommissionPayOrderCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        BillingCommissionPayOrderCallbackResponse self = new BillingCommissionPayOrderCallbackResponse();
        return TeaModel.build(map, self);
    }

    public BillingCommissionPayOrderCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BillingCommissionPayOrderCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BillingCommissionPayOrderCallbackResponse setBody(BillingCommissionPayOrderCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public BillingCommissionPayOrderCallbackResponseBody getBody() {
        return this.body;
    }

}
