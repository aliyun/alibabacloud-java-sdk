// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeBaseAdministratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveKnowledgeBaseAdministratorResponseBody body;

    public static RemoveKnowledgeBaseAdministratorResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeBaseAdministratorResponse self = new RemoveKnowledgeBaseAdministratorResponse();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeBaseAdministratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveKnowledgeBaseAdministratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveKnowledgeBaseAdministratorResponse setBody(RemoveKnowledgeBaseAdministratorResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveKnowledgeBaseAdministratorResponseBody getBody() {
        return this.body;
    }

}
