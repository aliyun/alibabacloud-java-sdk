// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkflowDefinitionResponseBody body;

    public static CreateWorkflowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowDefinitionResponse self = new CreateWorkflowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkflowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkflowDefinitionResponse setBody(CreateWorkflowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkflowDefinitionResponseBody getBody() {
        return this.body;
    }

}
