// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotKnowledgeDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBotKnowledgeDetailsResponseBody body;

    public static ListBotKnowledgeDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotKnowledgeDetailsResponse self = new ListBotKnowledgeDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListBotKnowledgeDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotKnowledgeDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBotKnowledgeDetailsResponse setBody(ListBotKnowledgeDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotKnowledgeDetailsResponseBody getBody() {
        return this.body;
    }

}
