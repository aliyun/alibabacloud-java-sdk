// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMonitoringAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupMonitoringAgentProcessResponseBody body;

    public static CreateGroupMonitoringAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMonitoringAgentProcessResponse self = new CreateGroupMonitoringAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupMonitoringAgentProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupMonitoringAgentProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupMonitoringAgentProcessResponse setBody(CreateGroupMonitoringAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

}
