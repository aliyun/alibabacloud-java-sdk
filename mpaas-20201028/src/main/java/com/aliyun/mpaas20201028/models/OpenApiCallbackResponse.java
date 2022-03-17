// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public OpenApiCallbackResponse setBody(OpenApiCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiCallbackResponseBody getBody() {
        return this.body;
    }

}
