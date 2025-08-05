// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RenameWorkflowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameWorkflowDefinitionResponseBody body;

    public static RenameWorkflowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameWorkflowDefinitionResponse self = new RenameWorkflowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public RenameWorkflowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameWorkflowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameWorkflowDefinitionResponse setBody(RenameWorkflowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameWorkflowDefinitionResponseBody getBody() {
        return this.body;
    }

}
