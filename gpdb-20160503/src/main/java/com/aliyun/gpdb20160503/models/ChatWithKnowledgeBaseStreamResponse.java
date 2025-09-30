// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatWithKnowledgeBaseStreamResponseBody body;

    public static ChatWithKnowledgeBaseStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatWithKnowledgeBaseStreamResponse self = new ChatWithKnowledgeBaseStreamResponse();
        return TeaModel.build(map, self);
    }

    public ChatWithKnowledgeBaseStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatWithKnowledgeBaseStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatWithKnowledgeBaseStreamResponse setBody(ChatWithKnowledgeBaseStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatWithKnowledgeBaseStreamResponseBody getBody() {
        return this.body;
    }

}
