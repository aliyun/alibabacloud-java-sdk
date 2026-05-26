// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteRoleAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRoleAssignmentResponseBody body;

    public static DeleteRoleAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleAssignmentResponse self = new DeleteRoleAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoleAssignmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoleAssignmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoleAssignmentResponse setBody(DeleteRoleAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoleAssignmentResponseBody getBody() {
        return this.body;
    }

}
