// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class InstallMonitoringAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InstallMonitoringAgentResponse setBody(InstallMonitoringAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallMonitoringAgentResponseBody getBody() {
        return this.body;
    }

}
