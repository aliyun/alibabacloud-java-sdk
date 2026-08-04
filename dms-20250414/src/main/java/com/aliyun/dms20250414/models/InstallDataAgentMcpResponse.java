// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class InstallDataAgentMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallDataAgentMcpResponseBody body;

    public static InstallDataAgentMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallDataAgentMcpResponse self = new InstallDataAgentMcpResponse();
        return TeaModel.build(map, self);
    }

    public InstallDataAgentMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallDataAgentMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallDataAgentMcpResponse setBody(InstallDataAgentMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallDataAgentMcpResponseBody getBody() {
        return this.body;
    }

}
