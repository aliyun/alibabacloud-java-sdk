// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class InstallWorkspacePluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallWorkspacePluginResponseBody body;

    public static InstallWorkspacePluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallWorkspacePluginResponse self = new InstallWorkspacePluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallWorkspacePluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallWorkspacePluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallWorkspacePluginResponse setBody(InstallWorkspacePluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallWorkspacePluginResponseBody getBody() {
        return this.body;
    }

}
