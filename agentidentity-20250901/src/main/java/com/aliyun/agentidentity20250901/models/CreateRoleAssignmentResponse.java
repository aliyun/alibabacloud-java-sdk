// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateRoleAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoleAssignmentResponseBody body;

    public static CreateRoleAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleAssignmentResponse self = new CreateRoleAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoleAssignmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoleAssignmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoleAssignmentResponse setBody(CreateRoleAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoleAssignmentResponseBody getBody() {
        return this.body;
    }

}
