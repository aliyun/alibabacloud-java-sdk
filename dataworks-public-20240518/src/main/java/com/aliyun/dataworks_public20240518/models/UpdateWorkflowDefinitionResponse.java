// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkflowDefinitionResponseBody body;

    public static UpdateWorkflowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowDefinitionResponse self = new UpdateWorkflowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkflowDefinitionResponse setBody(UpdateWorkflowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowDefinitionResponseBody getBody() {
        return this.body;
    }

}
