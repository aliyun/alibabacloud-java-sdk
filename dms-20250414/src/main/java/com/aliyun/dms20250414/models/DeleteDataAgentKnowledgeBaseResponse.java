// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataAgentKnowledgeBaseResponseBody body;

    public static DeleteDataAgentKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentKnowledgeBaseResponse self = new DeleteDataAgentKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataAgentKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataAgentKnowledgeBaseResponse setBody(DeleteDataAgentKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataAgentKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
