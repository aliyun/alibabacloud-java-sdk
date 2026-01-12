// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KnowledgeBaseResult body;

    public static GetKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseResponse self = new GetKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeBaseResponse setBody(KnowledgeBaseResult body) {
        this.body = body;
        return this;
    }
    public KnowledgeBaseResult getBody() {
        return this.body;
    }

}
