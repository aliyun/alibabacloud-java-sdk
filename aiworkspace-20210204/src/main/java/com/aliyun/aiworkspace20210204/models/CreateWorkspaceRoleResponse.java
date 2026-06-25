// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkspaceRoleResponseBody body;

    public static CreateWorkspaceRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRoleResponse self = new CreateWorkspaceRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkspaceRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkspaceRoleResponse setBody(CreateWorkspaceRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkspaceRoleResponseBody getBody() {
        return this.body;
    }

}
