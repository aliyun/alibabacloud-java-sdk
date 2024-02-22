// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductsOfActiveMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductsOfActiveMetricRuleResponseBody body;

    public static DescribeProductsOfActiveMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsOfActiveMetricRuleResponse self = new DescribeProductsOfActiveMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductsOfActiveMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductsOfActiveMetricRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductsOfActiveMetricRuleResponse setBody(DescribeProductsOfActiveMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductsOfActiveMetricRuleResponseBody getBody() {
        return this.body;
    }

}
