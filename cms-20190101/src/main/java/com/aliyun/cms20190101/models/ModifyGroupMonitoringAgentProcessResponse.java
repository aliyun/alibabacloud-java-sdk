// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGroupMonitoringAgentProcessResponseBody body;

    public static ModifyGroupMonitoringAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupMonitoringAgentProcessResponse self = new ModifyGroupMonitoringAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGroupMonitoringAgentProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGroupMonitoringAgentProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGroupMonitoringAgentProcessResponse setBody(ModifyGroupMonitoringAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGroupMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

}
