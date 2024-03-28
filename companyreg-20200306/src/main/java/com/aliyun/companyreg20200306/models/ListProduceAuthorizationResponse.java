// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListProduceAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProduceAuthorizationResponseBody body;

    public static ListProduceAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProduceAuthorizationResponse self = new ListProduceAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ListProduceAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProduceAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProduceAuthorizationResponse setBody(ListProduceAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProduceAuthorizationResponseBody getBody() {
        return this.body;
    }

}
