// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteWorkflowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkflowDefinitionResponseBody body;

    public static DeleteWorkflowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowDefinitionResponse self = new DeleteWorkflowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkflowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkflowDefinitionResponse setBody(DeleteWorkflowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkflowDefinitionResponseBody getBody() {
        return this.body;
    }

}
