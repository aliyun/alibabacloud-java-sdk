// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingMetricsResponseBody body;

    public static DescribeScalingMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingMetricsResponse self = new DescribeScalingMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingMetricsResponse setBody(DescribeScalingMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingMetricsResponseBody getBody() {
        return this.body;
    }

}
