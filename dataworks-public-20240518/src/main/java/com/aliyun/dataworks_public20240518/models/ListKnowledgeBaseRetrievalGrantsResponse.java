// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseRetrievalGrantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeBaseRetrievalGrantsResponseBody body;

    public static ListKnowledgeBaseRetrievalGrantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseRetrievalGrantsResponse self = new ListKnowledgeBaseRetrievalGrantsResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseRetrievalGrantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeBaseRetrievalGrantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeBaseRetrievalGrantsResponse setBody(ListKnowledgeBaseRetrievalGrantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeBaseRetrievalGrantsResponseBody getBody() {
        return this.body;
    }

}
