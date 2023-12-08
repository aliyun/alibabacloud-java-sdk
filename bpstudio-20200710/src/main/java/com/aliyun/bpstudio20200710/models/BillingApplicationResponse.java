// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20200710.models;

import com.aliyun.tea.*;

public class BillingApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BillingApplicationResponseBody body;

    public static BillingApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        BillingApplicationResponse self = new BillingApplicationResponse();
        return TeaModel.build(map, self);
    }

    public BillingApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BillingApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BillingApplicationResponse setBody(BillingApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public BillingApplicationResponseBody getBody() {
        return this.body;
    }

}
