// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScalingInstancesResponseBody body;

    public static DescribeScalingInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingInstancesResponse self = new DescribeScalingInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScalingInstancesResponse setBody(DescribeScalingInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingInstancesResponseBody getBody() {
        return this.body;
    }

}
