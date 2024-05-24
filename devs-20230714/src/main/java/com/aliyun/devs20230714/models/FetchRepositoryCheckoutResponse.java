// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class FetchRepositoryCheckoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Checkout body;

    public static FetchRepositoryCheckoutResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchRepositoryCheckoutResponse self = new FetchRepositoryCheckoutResponse();
        return TeaModel.build(map, self);
    }

    public FetchRepositoryCheckoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchRepositoryCheckoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchRepositoryCheckoutResponse setBody(Checkout body) {
        this.body = body;
        return this;
    }
    public Checkout getBody() {
        return this.body;
    }

}
