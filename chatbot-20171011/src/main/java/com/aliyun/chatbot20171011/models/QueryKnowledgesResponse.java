// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryKnowledgesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryKnowledgesResponseBody body;

    public static QueryKnowledgesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgesResponse self = new QueryKnowledgesResponse();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryKnowledgesResponse setBody(QueryKnowledgesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryKnowledgesResponseBody getBody() {
        return this.body;
    }

}
