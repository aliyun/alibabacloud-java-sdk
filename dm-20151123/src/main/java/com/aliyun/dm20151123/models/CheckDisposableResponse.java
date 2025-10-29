// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckDisposableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDisposableResponseBody body;

    public static CheckDisposableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDisposableResponse self = new CheckDisposableResponse();
        return TeaModel.build(map, self);
    }

    public CheckDisposableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDisposableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDisposableResponse setBody(CheckDisposableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDisposableResponseBody getBody() {
        return this.body;
    }

}
