// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCenterIVerifyServiceVerifyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BillingCenterIVerifyServiceVerifyOrderResponseBody body;

    public static BillingCenterIVerifyServiceVerifyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        BillingCenterIVerifyServiceVerifyOrderResponse self = new BillingCenterIVerifyServiceVerifyOrderResponse();
        return TeaModel.build(map, self);
    }

    public BillingCenterIVerifyServiceVerifyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BillingCenterIVerifyServiceVerifyOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BillingCenterIVerifyServiceVerifyOrderResponse setBody(BillingCenterIVerifyServiceVerifyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public BillingCenterIVerifyServiceVerifyOrderResponseBody getBody() {
        return this.body;
    }

}
