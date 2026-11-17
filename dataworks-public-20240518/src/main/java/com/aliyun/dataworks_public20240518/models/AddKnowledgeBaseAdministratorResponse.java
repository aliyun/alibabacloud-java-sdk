// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AddKnowledgeBaseAdministratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddKnowledgeBaseAdministratorResponseBody body;

    public static AddKnowledgeBaseAdministratorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeBaseAdministratorResponse self = new AddKnowledgeBaseAdministratorResponse();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeBaseAdministratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddKnowledgeBaseAdministratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddKnowledgeBaseAdministratorResponse setBody(AddKnowledgeBaseAdministratorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddKnowledgeBaseAdministratorResponseBody getBody() {
        return this.body;
    }

}
