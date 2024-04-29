// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptySlsLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EmptySlsLogstoreResponseBody body;

    public static EmptySlsLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        EmptySlsLogstoreResponse self = new EmptySlsLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public EmptySlsLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EmptySlsLogstoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EmptySlsLogstoreResponse setBody(EmptySlsLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public EmptySlsLogstoreResponseBody getBody() {
        return this.body;
    }

}
