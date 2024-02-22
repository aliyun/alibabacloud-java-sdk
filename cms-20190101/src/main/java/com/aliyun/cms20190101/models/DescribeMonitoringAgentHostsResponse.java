// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitoringAgentHostsResponseBody body;

    public static DescribeMonitoringAgentHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentHostsResponse self = new DescribeMonitoringAgentHostsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitoringAgentHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitoringAgentHostsResponse setBody(DescribeMonitoringAgentHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitoringAgentHostsResponseBody getBody() {
        return this.body;
    }

}
