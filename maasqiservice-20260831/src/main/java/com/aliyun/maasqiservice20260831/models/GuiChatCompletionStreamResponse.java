// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class GuiChatCompletionStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GuiChatCompletionStreamResponseBody body;

    public static GuiChatCompletionStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        GuiChatCompletionStreamResponse self = new GuiChatCompletionStreamResponse();
        return TeaModel.build(map, self);
    }

    public GuiChatCompletionStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GuiChatCompletionStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GuiChatCompletionStreamResponse setBody(GuiChatCompletionStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public GuiChatCompletionStreamResponseBody getBody() {
        return this.body;
    }

}
