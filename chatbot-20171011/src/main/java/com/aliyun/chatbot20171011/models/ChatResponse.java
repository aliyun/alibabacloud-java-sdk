// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ChatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ChatResponse setBody(ChatResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatResponseBody getBody() {
        return this.body;
    }

}
