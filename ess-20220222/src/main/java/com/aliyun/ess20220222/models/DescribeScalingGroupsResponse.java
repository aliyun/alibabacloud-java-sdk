// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScalingGroupsResponseBody body;

    public static DescribeScalingGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupsResponse self = new DescribeScalingGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScalingGroupsResponse setBody(DescribeScalingGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingGroupsResponseBody getBody() {
        return this.body;
    }

}
