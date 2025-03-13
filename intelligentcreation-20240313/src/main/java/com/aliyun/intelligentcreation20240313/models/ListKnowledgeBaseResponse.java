// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KnowledgeBaseListResult body;

    public static ListKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseResponse self = new ListKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeBaseResponse setBody(KnowledgeBaseListResult body) {
        this.body = body;
        return this;
    }
    public KnowledgeBaseListResult getBody() {
        return this.body;
    }

}
