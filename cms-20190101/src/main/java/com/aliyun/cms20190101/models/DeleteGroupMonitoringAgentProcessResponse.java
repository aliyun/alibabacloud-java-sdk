// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteGroupMonitoringAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGroupMonitoringAgentProcessResponseBody body;

    public static DeleteGroupMonitoringAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupMonitoringAgentProcessResponse self = new DeleteGroupMonitoringAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupMonitoringAgentProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupMonitoringAgentProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupMonitoringAgentProcessResponse setBody(DeleteGroupMonitoringAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

}
