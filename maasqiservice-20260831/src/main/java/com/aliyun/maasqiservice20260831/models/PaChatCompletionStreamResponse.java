// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class PaChatCompletionStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PaChatCompletionStreamResponseBody body;

    public static PaChatCompletionStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        PaChatCompletionStreamResponse self = new PaChatCompletionStreamResponse();
        return TeaModel.build(map, self);
    }

    public PaChatCompletionStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PaChatCompletionStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PaChatCompletionStreamResponse setBody(PaChatCompletionStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public PaChatCompletionStreamResponseBody getBody() {
        return this.body;
    }

}
