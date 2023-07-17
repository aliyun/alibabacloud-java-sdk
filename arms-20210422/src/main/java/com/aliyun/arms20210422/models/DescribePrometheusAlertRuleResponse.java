// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DescribePrometheusAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePrometheusAlertRuleResponseBody body;

    public static DescribePrometheusAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrometheusAlertRuleResponse self = new DescribePrometheusAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrometheusAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrometheusAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrometheusAlertRuleResponse setBody(DescribePrometheusAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

}
