// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KnowledgeBaseResult body;

    public static UpdateKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseResponse self = new UpdateKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseResponse setBody(KnowledgeBaseResult body) {
        this.body = body;
        return this;
    }
    public KnowledgeBaseResult getBody() {
        return this.body;
    }

}
