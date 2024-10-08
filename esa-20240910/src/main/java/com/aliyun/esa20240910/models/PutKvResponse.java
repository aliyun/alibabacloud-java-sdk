// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutKvResponseBody body;

    public static PutKvResponse build(java.util.Map<String, ?> map) throws Exception {
        PutKvResponse self = new PutKvResponse();
        return TeaModel.build(map, self);
    }

    public PutKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutKvResponse setBody(PutKvResponseBody body) {
        this.body = body;
        return this;
    }
    public PutKvResponseBody getBody() {
        return this.body;
    }

}
