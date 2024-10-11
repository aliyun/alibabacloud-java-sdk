// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DetachDbfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachDbfsResponseBody body;

    public static DetachDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDbfsResponse self = new DetachDbfsResponse();
        return TeaModel.build(map, self);
    }

    public DetachDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachDbfsResponse setBody(DetachDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDbfsResponseBody getBody() {
        return this.body;
    }

}
