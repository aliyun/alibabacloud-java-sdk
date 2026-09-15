// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class AigcChatCompletionStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AigcChatCompletionStreamResponseBody body;

    public static AigcChatCompletionStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        AigcChatCompletionStreamResponse self = new AigcChatCompletionStreamResponse();
        return TeaModel.build(map, self);
    }

    public AigcChatCompletionStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AigcChatCompletionStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AigcChatCompletionStreamResponse setBody(AigcChatCompletionStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public AigcChatCompletionStreamResponseBody getBody() {
        return this.body;
    }

}
