// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricRuleCountResponseBody body;

    public static DescribeMetricRuleCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleCountResponse self = new DescribeMetricRuleCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricRuleCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricRuleCountResponse setBody(DescribeMetricRuleCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleCountResponseBody getBody() {
        return this.body;
    }

}
