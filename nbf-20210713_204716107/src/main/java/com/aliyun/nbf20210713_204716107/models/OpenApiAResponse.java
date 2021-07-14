// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204716107.models;

import com.aliyun.tea.*;

public class OpenApiAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenApiAResponseBody body;

    public static OpenApiAResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiAResponse self = new OpenApiAResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiAResponse setBody(OpenApiAResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiAResponseBody getBody() {
        return this.body;
    }

}
