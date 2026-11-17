// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AuthorizeConsumerModelCardGrantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeConsumerModelCardGrantsResponseBody body;

    public static AuthorizeConsumerModelCardGrantsResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeConsumerModelCardGrantsResponse self = new AuthorizeConsumerModelCardGrantsResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeConsumerModelCardGrantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeConsumerModelCardGrantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeConsumerModelCardGrantsResponse setBody(AuthorizeConsumerModelCardGrantsResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeConsumerModelCardGrantsResponseBody getBody() {
        return this.body;
    }

}
