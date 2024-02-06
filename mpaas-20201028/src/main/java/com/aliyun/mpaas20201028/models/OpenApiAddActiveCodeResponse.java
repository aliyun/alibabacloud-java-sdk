// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiAddActiveCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiAddActiveCodeResponseBody body;

    public static OpenApiAddActiveCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiAddActiveCodeResponse self = new OpenApiAddActiveCodeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiAddActiveCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiAddActiveCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiAddActiveCodeResponse setBody(OpenApiAddActiveCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiAddActiveCodeResponseBody getBody() {
        return this.body;
    }

}
