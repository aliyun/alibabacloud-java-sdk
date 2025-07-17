// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvDropMetricsRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnvDropMetricsRuleResponseBody body;

    public static DescribeEnvDropMetricsRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvDropMetricsRuleResponse self = new DescribeEnvDropMetricsRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnvDropMetricsRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnvDropMetricsRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnvDropMetricsRuleResponse setBody(DescribeEnvDropMetricsRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnvDropMetricsRuleResponseBody getBody() {
        return this.body;
    }

}
