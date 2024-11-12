// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDiagnoseDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScalingGroupDiagnoseDetailsResponseBody body;

    public static DescribeScalingGroupDiagnoseDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupDiagnoseDetailsResponse self = new DescribeScalingGroupDiagnoseDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupDiagnoseDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingGroupDiagnoseDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScalingGroupDiagnoseDetailsResponse setBody(DescribeScalingGroupDiagnoseDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingGroupDiagnoseDetailsResponseBody getBody() {
        return this.body;
    }

}
