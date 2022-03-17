// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiEncodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public OpenApiEncodeResponse setBody(OpenApiEncodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiEncodeResponseBody getBody() {
        return this.body;
    }

}
