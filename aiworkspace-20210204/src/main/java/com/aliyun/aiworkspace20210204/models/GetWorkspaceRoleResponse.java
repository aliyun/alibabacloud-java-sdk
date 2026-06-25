// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetWorkspaceRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkspaceRoleResponseBody body;

    public static GetWorkspaceRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceRoleResponse self = new GetWorkspaceRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceRoleResponse setBody(GetWorkspaceRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceRoleResponseBody getBody() {
        return this.body;
    }

}
