// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class RemoveUserToDataAgentWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserToDataAgentWorkspaceResponseBody body;

    public static RemoveUserToDataAgentWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserToDataAgentWorkspaceResponse self = new RemoveUserToDataAgentWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserToDataAgentWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserToDataAgentWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserToDataAgentWorkspaceResponse setBody(RemoveUserToDataAgentWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserToDataAgentWorkspaceResponseBody getBody() {
        return this.body;
    }

}
