// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotHotKnowledgesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBotHotKnowledgesResponseBody body;

    public static ListBotHotKnowledgesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotHotKnowledgesResponse self = new ListBotHotKnowledgesResponse();
        return TeaModel.build(map, self);
    }

    public ListBotHotKnowledgesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotHotKnowledgesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBotHotKnowledgesResponse setBody(ListBotHotKnowledgesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotHotKnowledgesResponseBody getBody() {
        return this.body;
    }

}
