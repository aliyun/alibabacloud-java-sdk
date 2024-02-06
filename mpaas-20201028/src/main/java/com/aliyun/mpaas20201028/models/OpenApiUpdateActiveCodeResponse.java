// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiUpdateActiveCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiUpdateActiveCodeResponseBody body;

    public static OpenApiUpdateActiveCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiUpdateActiveCodeResponse self = new OpenApiUpdateActiveCodeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiUpdateActiveCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiUpdateActiveCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiUpdateActiveCodeResponse setBody(OpenApiUpdateActiveCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiUpdateActiveCodeResponseBody getBody() {
        return this.body;
    }

}
