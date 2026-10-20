// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class QueryDisplayKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDisplayKnowledgeResponseBody body;

    public static QueryDisplayKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDisplayKnowledgeResponse self = new QueryDisplayKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDisplayKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDisplayKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDisplayKnowledgeResponse setBody(QueryDisplayKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDisplayKnowledgeResponseBody getBody() {
        return this.body;
    }

}
