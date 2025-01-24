// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class ChatMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatMessageResponseBody body;

    public static ChatMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatMessageResponse self = new ChatMessageResponse();
        return TeaModel.build(map, self);
    }

    public ChatMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatMessageResponse setBody(ChatMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatMessageResponseBody getBody() {
        return this.body;
    }

}
