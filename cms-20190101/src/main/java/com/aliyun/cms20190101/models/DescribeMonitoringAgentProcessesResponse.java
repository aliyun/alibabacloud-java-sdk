// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitoringAgentProcessesResponseBody body;

    public static DescribeMonitoringAgentProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentProcessesResponse self = new DescribeMonitoringAgentProcessesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitoringAgentProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitoringAgentProcessesResponse setBody(DescribeMonitoringAgentProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitoringAgentProcessesResponseBody getBody() {
        return this.body;
    }

}
