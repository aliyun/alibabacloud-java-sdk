// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeCustomAgentMonitorMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomAgentMonitorMetricsResponseBody body;

    public static DescribeCustomAgentMonitorMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomAgentMonitorMetricsResponse self = new DescribeCustomAgentMonitorMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomAgentMonitorMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomAgentMonitorMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomAgentMonitorMetricsResponse setBody(DescribeCustomAgentMonitorMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomAgentMonitorMetricsResponseBody getBody() {
        return this.body;
    }

}
