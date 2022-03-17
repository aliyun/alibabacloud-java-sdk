// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiDecodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public OpenApiDecodeResponse setBody(OpenApiDecodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiDecodeResponseBody getBody() {
        return this.body;
    }

}
