// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiDeleteActiveCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiDeleteActiveCodeResponseBody body;

    public static OpenApiDeleteActiveCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiDeleteActiveCodeResponse self = new OpenApiDeleteActiveCodeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiDeleteActiveCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiDeleteActiveCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiDeleteActiveCodeResponse setBody(OpenApiDeleteActiveCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiDeleteActiveCodeResponseBody getBody() {
        return this.body;
    }

}
