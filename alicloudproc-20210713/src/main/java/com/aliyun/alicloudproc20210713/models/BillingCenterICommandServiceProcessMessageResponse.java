// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCenterICommandServiceProcessMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BillingCenterICommandServiceProcessMessageResponseBody body;

    public static BillingCenterICommandServiceProcessMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        BillingCenterICommandServiceProcessMessageResponse self = new BillingCenterICommandServiceProcessMessageResponse();
        return TeaModel.build(map, self);
    }

    public BillingCenterICommandServiceProcessMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BillingCenterICommandServiceProcessMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BillingCenterICommandServiceProcessMessageResponse setBody(BillingCenterICommandServiceProcessMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public BillingCenterICommandServiceProcessMessageResponseBody getBody() {
        return this.body;
    }

}
