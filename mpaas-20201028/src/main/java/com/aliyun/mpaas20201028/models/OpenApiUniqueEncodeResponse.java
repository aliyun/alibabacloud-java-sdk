// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiUniqueEncodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiUniqueEncodeResponseBody body;

    public static OpenApiUniqueEncodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiUniqueEncodeResponse self = new OpenApiUniqueEncodeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiUniqueEncodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiUniqueEncodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiUniqueEncodeResponse setBody(OpenApiUniqueEncodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiUniqueEncodeResponseBody getBody() {
        return this.body;
    }

}
