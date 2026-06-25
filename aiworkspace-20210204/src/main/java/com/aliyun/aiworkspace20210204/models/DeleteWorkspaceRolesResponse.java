// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkspaceRolesResponseBody body;

    public static DeleteWorkspaceRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceRolesResponse self = new DeleteWorkspaceRolesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceRolesResponse setBody(DeleteWorkspaceRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceRolesResponseBody getBody() {
        return this.body;
    }

}
