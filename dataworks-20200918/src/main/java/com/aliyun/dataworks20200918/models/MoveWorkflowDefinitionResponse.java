// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class MoveWorkflowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveWorkflowDefinitionResponseBody body;

    public static MoveWorkflowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveWorkflowDefinitionResponse self = new MoveWorkflowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public MoveWorkflowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveWorkflowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveWorkflowDefinitionResponse setBody(MoveWorkflowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveWorkflowDefinitionResponseBody getBody() {
        return this.body;
    }

}
