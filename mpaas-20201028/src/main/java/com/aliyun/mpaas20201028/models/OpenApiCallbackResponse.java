// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiCallbackResponseBody body;

    public static OpenApiCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiCallbackResponse self = new OpenApiCallbackResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiCallbackResponse setBody(OpenApiCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiCallbackResponseBody getBody() {
        return this.body;
    }

}
