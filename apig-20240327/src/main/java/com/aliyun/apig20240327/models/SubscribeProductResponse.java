// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SubscribeProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubscribeProductResponseBody body;

    public static SubscribeProductResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeProductResponse self = new SubscribeProductResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubscribeProductResponse setBody(SubscribeProductResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeProductResponseBody getBody() {
        return this.body;
    }

}
