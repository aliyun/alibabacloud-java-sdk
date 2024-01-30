// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationScalingRulesResponseBody body;

    public static DescribeApplicationScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesResponse self = new DescribeApplicationScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationScalingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationScalingRulesResponse setBody(DescribeApplicationScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationScalingRulesResponseBody getBody() {
        return this.body;
    }

}
