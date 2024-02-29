// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CheckoutWithAKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckoutWithAKResponseBody body;

    public static CheckoutWithAKResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckoutWithAKResponse self = new CheckoutWithAKResponse();
        return TeaModel.build(map, self);
    }

    public CheckoutWithAKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckoutWithAKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckoutWithAKResponse setBody(CheckoutWithAKResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckoutWithAKResponseBody getBody() {
        return this.body;
    }

}
