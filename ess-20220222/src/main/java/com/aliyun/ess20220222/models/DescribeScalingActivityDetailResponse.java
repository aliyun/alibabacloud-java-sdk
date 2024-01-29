// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScalingActivityDetailResponseBody body;

    public static DescribeScalingActivityDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityDetailResponse self = new DescribeScalingActivityDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingActivityDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScalingActivityDetailResponse setBody(DescribeScalingActivityDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingActivityDetailResponseBody getBody() {
        return this.body;
    }

}
