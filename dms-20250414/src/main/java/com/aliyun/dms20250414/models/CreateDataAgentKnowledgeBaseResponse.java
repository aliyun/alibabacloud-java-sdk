// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataAgentKnowledgeBaseResponseBody body;

    public static CreateDataAgentKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentKnowledgeBaseResponse self = new CreateDataAgentKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAgentKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataAgentKnowledgeBaseResponse setBody(CreateDataAgentKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAgentKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
