// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricRuleTargetsResponseBody body;

    public static DescribeMetricRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTargetsResponse self = new DescribeMetricRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricRuleTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricRuleTargetsResponse setBody(DescribeMetricRuleTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleTargetsResponseBody getBody() {
        return this.body;
    }

}
