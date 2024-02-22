// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class InstallMonitoringAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallMonitoringAgentResponseBody body;

    public static InstallMonitoringAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallMonitoringAgentResponse self = new InstallMonitoringAgentResponse();
        return TeaModel.build(map, self);
    }

    public InstallMonitoringAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallMonitoringAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallMonitoringAgentResponse setBody(InstallMonitoringAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallMonitoringAgentResponseBody getBody() {
        return this.body;
    }

}
