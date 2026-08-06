// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class SearchKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchKnowledgeBaseResponseBody body;

    public static SearchKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchKnowledgeBaseResponse self = new SearchKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public SearchKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchKnowledgeBaseResponse setBody(SearchKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
