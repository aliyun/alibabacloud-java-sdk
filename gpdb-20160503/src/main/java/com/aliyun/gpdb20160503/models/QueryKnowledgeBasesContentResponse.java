// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryKnowledgeBasesContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryKnowledgeBasesContentResponseBody body;

    public static QueryKnowledgeBasesContentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgeBasesContentResponse self = new QueryKnowledgeBasesContentResponse();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgeBasesContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryKnowledgeBasesContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryKnowledgeBasesContentResponse setBody(QueryKnowledgeBasesContentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryKnowledgeBasesContentResponseBody getBody() {
        return this.body;
    }

}
