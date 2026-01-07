// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentWorkspaceMemberRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataAgentWorkspaceMemberRoleResponseBody body;

    public static UpdateDataAgentWorkspaceMemberRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentWorkspaceMemberRoleResponse self = new UpdateDataAgentWorkspaceMemberRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentWorkspaceMemberRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataAgentWorkspaceMemberRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataAgentWorkspaceMemberRoleResponse setBody(UpdateDataAgentWorkspaceMemberRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataAgentWorkspaceMemberRoleResponseBody getBody() {
        return this.body;
    }

}
