// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class BindProduceAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindProduceAuthorizationResponseBody body;

    public static BindProduceAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        BindProduceAuthorizationResponse self = new BindProduceAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public BindProduceAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindProduceAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindProduceAuthorizationResponse setBody(BindProduceAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public BindProduceAuthorizationResponseBody getBody() {
        return this.body;
    }

}
