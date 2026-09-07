// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateGrafanaWorkspaceAccountRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGrafanaWorkspaceAccountRoleResponseBody body;

    public static UpdateGrafanaWorkspaceAccountRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGrafanaWorkspaceAccountRoleResponse self = new UpdateGrafanaWorkspaceAccountRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGrafanaWorkspaceAccountRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGrafanaWorkspaceAccountRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGrafanaWorkspaceAccountRoleResponse setBody(UpdateGrafanaWorkspaceAccountRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGrafanaWorkspaceAccountRoleResponseBody getBody() {
        return this.body;
    }

}
