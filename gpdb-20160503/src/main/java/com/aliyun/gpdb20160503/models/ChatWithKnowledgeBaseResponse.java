// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatWithKnowledgeBaseResponseBody body;

    public static ChatWithKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatWithKnowledgeBaseResponse self = new ChatWithKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public ChatWithKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatWithKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatWithKnowledgeBaseResponse setBody(ChatWithKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatWithKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
