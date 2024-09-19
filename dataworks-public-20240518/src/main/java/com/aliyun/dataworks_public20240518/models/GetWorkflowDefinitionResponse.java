// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowDefinitionResponseBody body;

    public static GetWorkflowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDefinitionResponse self = new GetWorkflowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowDefinitionResponse setBody(GetWorkflowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowDefinitionResponseBody getBody() {
        return this.body;
    }

}
