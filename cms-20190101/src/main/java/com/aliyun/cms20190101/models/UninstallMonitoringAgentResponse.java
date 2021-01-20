// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class UninstallMonitoringAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallMonitoringAgentResponseBody body;

    public static UninstallMonitoringAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallMonitoringAgentResponse self = new UninstallMonitoringAgentResponse();
        return TeaModel.build(map, self);
    }

    public UninstallMonitoringAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallMonitoringAgentResponse setBody(UninstallMonitoringAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallMonitoringAgentResponseBody getBody() {
        return this.body;
    }

}
