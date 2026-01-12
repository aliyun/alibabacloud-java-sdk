// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeBasesResult body;

    public static ListKnowledgeBasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesResponse self = new ListKnowledgeBasesResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeBasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeBasesResponse setBody(ListKnowledgeBasesResult body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeBasesResult getBody() {
        return this.body;
    }

}
