// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AddUserToDataAgentWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserToDataAgentWorkspaceResponseBody body;

    public static AddUserToDataAgentWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDataAgentWorkspaceResponse self = new AddUserToDataAgentWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToDataAgentWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToDataAgentWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserToDataAgentWorkspaceResponse setBody(AddUserToDataAgentWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToDataAgentWorkspaceResponseBody getBody() {
        return this.body;
    }

}
