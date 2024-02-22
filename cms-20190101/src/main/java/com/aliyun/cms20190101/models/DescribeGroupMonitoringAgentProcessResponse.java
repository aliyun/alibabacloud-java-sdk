// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeGroupMonitoringAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupMonitoringAgentProcessResponseBody body;

    public static DescribeGroupMonitoringAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupMonitoringAgentProcessResponse self = new DescribeGroupMonitoringAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupMonitoringAgentProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupMonitoringAgentProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupMonitoringAgentProcessResponse setBody(DescribeGroupMonitoringAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

}
