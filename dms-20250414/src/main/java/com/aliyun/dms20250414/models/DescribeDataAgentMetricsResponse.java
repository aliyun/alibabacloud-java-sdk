// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataAgentMetricsResponseBody body;

    public static DescribeDataAgentMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentMetricsResponse self = new DescribeDataAgentMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataAgentMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataAgentMetricsResponse setBody(DescribeDataAgentMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataAgentMetricsResponseBody getBody() {
        return this.body;
    }

}
