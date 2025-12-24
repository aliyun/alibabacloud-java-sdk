// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScalingActivityStatisticsResponseBody body;

    public static DescribeScalingActivityStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityStatisticsResponse self = new DescribeScalingActivityStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingActivityStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScalingActivityStatisticsResponse setBody(DescribeScalingActivityStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingActivityStatisticsResponseBody getBody() {
        return this.body;
    }

}
