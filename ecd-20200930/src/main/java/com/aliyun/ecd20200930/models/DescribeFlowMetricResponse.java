// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFlowMetricResponseBody body;

    public static DescribeFlowMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowMetricResponse self = new DescribeFlowMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowMetricResponse setBody(DescribeFlowMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowMetricResponseBody getBody() {
        return this.body;
    }

}
