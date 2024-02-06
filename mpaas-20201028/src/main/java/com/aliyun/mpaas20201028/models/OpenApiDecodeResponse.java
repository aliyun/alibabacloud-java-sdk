// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiDecodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiDecodeResponseBody body;

    public static OpenApiDecodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiDecodeResponse self = new OpenApiDecodeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiDecodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiDecodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiDecodeResponse setBody(OpenApiDecodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiDecodeResponseBody getBody() {
        return this.body;
    }

}
