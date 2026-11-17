// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RevokeKnowledgeBaseRetrievalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeKnowledgeBaseRetrievalResponseBody body;

    public static RevokeKnowledgeBaseRetrievalResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeKnowledgeBaseRetrievalResponse self = new RevokeKnowledgeBaseRetrievalResponse();
        return TeaModel.build(map, self);
    }

    public RevokeKnowledgeBaseRetrievalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeKnowledgeBaseRetrievalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeKnowledgeBaseRetrievalResponse setBody(RevokeKnowledgeBaseRetrievalResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeKnowledgeBaseRetrievalResponseBody getBody() {
        return this.body;
    }

}
