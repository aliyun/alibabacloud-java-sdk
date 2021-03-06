// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptySlsLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EmptySlsLogstoreResponse setBody(EmptySlsLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public EmptySlsLogstoreResponseBody getBody() {
        return this.body;
    }

}
