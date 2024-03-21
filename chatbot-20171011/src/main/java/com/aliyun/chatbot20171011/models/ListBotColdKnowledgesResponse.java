// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotColdKnowledgesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBotColdKnowledgesResponseBody body;

    public static ListBotColdKnowledgesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotColdKnowledgesResponse self = new ListBotColdKnowledgesResponse();
        return TeaModel.build(map, self);
    }

    public ListBotColdKnowledgesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotColdKnowledgesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBotColdKnowledgesResponse setBody(ListBotColdKnowledgesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotColdKnowledgesResponseBody getBody() {
        return this.body;
    }

}
