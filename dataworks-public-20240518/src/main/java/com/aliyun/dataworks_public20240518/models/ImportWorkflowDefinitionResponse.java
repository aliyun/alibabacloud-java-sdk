// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ImportWorkflowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportWorkflowDefinitionResponseBody body;

    public static ImportWorkflowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportWorkflowDefinitionResponse self = new ImportWorkflowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public ImportWorkflowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportWorkflowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportWorkflowDefinitionResponse setBody(ImportWorkflowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportWorkflowDefinitionResponseBody getBody() {
        return this.body;
    }

}
