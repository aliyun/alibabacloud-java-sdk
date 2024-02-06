// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiQueryActiveCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiQueryActiveCodeResponseBody body;

    public static OpenApiQueryActiveCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiQueryActiveCodeResponse self = new OpenApiQueryActiveCodeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiQueryActiveCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiQueryActiveCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiQueryActiveCodeResponse setBody(OpenApiQueryActiveCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiQueryActiveCodeResponseBody getBody() {
        return this.body;
    }

}
