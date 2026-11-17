// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RevokeConsumerModelCardGrantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeConsumerModelCardGrantsResponseBody body;

    public static RevokeConsumerModelCardGrantsResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeConsumerModelCardGrantsResponse self = new RevokeConsumerModelCardGrantsResponse();
        return TeaModel.build(map, self);
    }

    public RevokeConsumerModelCardGrantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeConsumerModelCardGrantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeConsumerModelCardGrantsResponse setBody(RevokeConsumerModelCardGrantsResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeConsumerModelCardGrantsResponseBody getBody() {
        return this.body;
    }

}
