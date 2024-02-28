// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScalingGroupDetailResponseBody body;

    public static DescribeScalingGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupDetailResponse self = new DescribeScalingGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScalingGroupDetailResponse setBody(DescribeScalingGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingGroupDetailResponseBody getBody() {
        return this.body;
    }

}
