// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiEncodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiEncodeResponseBody body;

    public static OpenApiEncodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiEncodeResponse self = new OpenApiEncodeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiEncodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiEncodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiEncodeResponse setBody(OpenApiEncodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiEncodeResponseBody getBody() {
        return this.body;
    }

}
