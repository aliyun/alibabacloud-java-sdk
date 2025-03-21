// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class OpenApiInvokeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiInvokeResponseBody body;

    public static OpenApiInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiInvokeResponse self = new OpenApiInvokeResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiInvokeResponse setBody(OpenApiInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiInvokeResponseBody getBody() {
        return this.body;
    }

}
