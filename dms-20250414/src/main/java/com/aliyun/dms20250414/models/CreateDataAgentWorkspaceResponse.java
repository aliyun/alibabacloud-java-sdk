// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataAgentWorkspaceResponseBody body;

    public static CreateDataAgentWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentWorkspaceResponse self = new CreateDataAgentWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAgentWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataAgentWorkspaceResponse setBody(CreateDataAgentWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAgentWorkspaceResponseBody getBody() {
        return this.body;
    }

}
