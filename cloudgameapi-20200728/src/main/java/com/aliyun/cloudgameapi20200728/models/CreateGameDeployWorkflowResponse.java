// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateGameDeployWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGameDeployWorkflowResponseBody body;

    public static CreateGameDeployWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGameDeployWorkflowResponse self = new CreateGameDeployWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public CreateGameDeployWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGameDeployWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGameDeployWorkflowResponse setBody(CreateGameDeployWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGameDeployWorkflowResponseBody getBody() {
        return this.body;
    }

}
