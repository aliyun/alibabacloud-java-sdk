// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeEciScalingConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEciScalingConfigurationsResponseBody body;

    public static DescribeEciScalingConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciScalingConfigurationsResponse self = new DescribeEciScalingConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEciScalingConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEciScalingConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEciScalingConfigurationsResponse setBody(DescribeEciScalingConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEciScalingConfigurationsResponseBody getBody() {
        return this.body;
    }

}
