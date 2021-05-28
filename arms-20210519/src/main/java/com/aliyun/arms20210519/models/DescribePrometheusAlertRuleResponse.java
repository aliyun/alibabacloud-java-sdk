// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DescribePrometheusAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribePrometheusAlertRuleResponse setBody(DescribePrometheusAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

}
