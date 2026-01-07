// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataAgentWorkspaceResponseBody body;

    public static DeleteDataAgentWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentWorkspaceResponse self = new DeleteDataAgentWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataAgentWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataAgentWorkspaceResponse setBody(DeleteDataAgentWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataAgentWorkspaceResponseBody getBody() {
        return this.body;
    }

}
