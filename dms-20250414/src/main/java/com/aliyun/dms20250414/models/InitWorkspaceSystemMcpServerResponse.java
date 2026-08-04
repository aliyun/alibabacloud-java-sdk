// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class InitWorkspaceSystemMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitWorkspaceSystemMcpServerResponseBody body;

    public static InitWorkspaceSystemMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        InitWorkspaceSystemMcpServerResponse self = new InitWorkspaceSystemMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public InitWorkspaceSystemMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitWorkspaceSystemMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitWorkspaceSystemMcpServerResponse setBody(InitWorkspaceSystemMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public InitWorkspaceSystemMcpServerResponseBody getBody() {
        return this.body;
    }

}
