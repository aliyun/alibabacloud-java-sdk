// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeEciScalingConfigurationDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEciScalingConfigurationDetailResponseBody body;

    public static DescribeEciScalingConfigurationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciScalingConfigurationDetailResponse self = new DescribeEciScalingConfigurationDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEciScalingConfigurationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEciScalingConfigurationDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEciScalingConfigurationDetailResponse setBody(DescribeEciScalingConfigurationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEciScalingConfigurationDetailResponseBody getBody() {
        return this.body;
    }

}
