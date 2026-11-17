// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GrantKnowledgeBaseRetrievalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantKnowledgeBaseRetrievalResponseBody body;

    public static GrantKnowledgeBaseRetrievalResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantKnowledgeBaseRetrievalResponse self = new GrantKnowledgeBaseRetrievalResponse();
        return TeaModel.build(map, self);
    }

    public GrantKnowledgeBaseRetrievalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantKnowledgeBaseRetrievalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantKnowledgeBaseRetrievalResponse setBody(GrantKnowledgeBaseRetrievalResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantKnowledgeBaseRetrievalResponseBody getBody() {
        return this.body;
    }

}
