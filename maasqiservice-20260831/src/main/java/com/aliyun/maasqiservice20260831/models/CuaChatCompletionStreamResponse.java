// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CuaChatCompletionStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CuaChatCompletionStreamResponseBody body;

    public static CuaChatCompletionStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        CuaChatCompletionStreamResponse self = new CuaChatCompletionStreamResponse();
        return TeaModel.build(map, self);
    }

    public CuaChatCompletionStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CuaChatCompletionStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CuaChatCompletionStreamResponse setBody(CuaChatCompletionStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public CuaChatCompletionStreamResponseBody getBody() {
        return this.body;
    }

}
