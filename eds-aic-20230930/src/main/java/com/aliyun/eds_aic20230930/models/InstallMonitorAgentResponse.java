// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstallMonitorAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallMonitorAgentResponseBody body;

    public static InstallMonitorAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallMonitorAgentResponse self = new InstallMonitorAgentResponse();
        return TeaModel.build(map, self);
    }

    public InstallMonitorAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallMonitorAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallMonitorAgentResponse setBody(InstallMonitorAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallMonitorAgentResponseBody getBody() {
        return this.body;
    }

}
