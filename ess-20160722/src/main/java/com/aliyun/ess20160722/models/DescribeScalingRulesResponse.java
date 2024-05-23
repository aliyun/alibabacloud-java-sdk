// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScalingRulesResponseBody body;

    public static DescribeScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRulesResponse self = new DescribeScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScalingRulesResponse setBody(DescribeScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingRulesResponseBody getBody() {
        return this.body;
    }

}
