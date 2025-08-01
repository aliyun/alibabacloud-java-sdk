// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallMonitorAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallMonitorAgentResponseBody body;

    public static UninstallMonitorAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallMonitorAgentResponse self = new UninstallMonitorAgentResponse();
        return TeaModel.build(map, self);
    }

    public UninstallMonitorAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallMonitorAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallMonitorAgentResponse setBody(UninstallMonitorAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallMonitorAgentResponseBody getBody() {
        return this.body;
    }

}
