// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkspaceRoleResponseBody body;

    public static UpdateWorkspaceRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRoleResponse self = new UpdateWorkspaceRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceRoleResponse setBody(UpdateWorkspaceRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceRoleResponseBody getBody() {
        return this.body;
    }

}
