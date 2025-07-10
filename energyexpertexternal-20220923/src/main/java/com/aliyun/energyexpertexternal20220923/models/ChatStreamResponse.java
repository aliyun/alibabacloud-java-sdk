// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatStreamResponseBody body;

    public static ChatStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatStreamResponse self = new ChatStreamResponse();
        return TeaModel.build(map, self);
    }

    public ChatStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatStreamResponse setBody(ChatStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatStreamResponseBody getBody() {
        return this.body;
    }

}
