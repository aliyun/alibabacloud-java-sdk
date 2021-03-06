// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GenerateWebSocketSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateWebSocketSignResponseBody body;

    public static GenerateWebSocketSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebSocketSignResponse self = new GenerateWebSocketSignResponse();
        return TeaModel.build(map, self);
    }

    public GenerateWebSocketSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateWebSocketSignResponse setBody(GenerateWebSocketSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateWebSocketSignResponseBody getBody() {
        return this.body;
    }

}
