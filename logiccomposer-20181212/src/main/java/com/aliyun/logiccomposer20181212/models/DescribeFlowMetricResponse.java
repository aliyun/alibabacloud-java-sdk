// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFlowMetricResponse setBody(DescribeFlowMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowMetricResponseBody getBody() {
        return this.body;
    }

}
