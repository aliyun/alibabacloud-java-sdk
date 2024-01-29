// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatResponseBody body;

    public static ChatResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatResponse self = new ChatResponse();
        return TeaModel.build(map, self);
    }

    public ChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatResponse setBody(ChatResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatResponseBody getBody() {
        return this.body;
    }

}
