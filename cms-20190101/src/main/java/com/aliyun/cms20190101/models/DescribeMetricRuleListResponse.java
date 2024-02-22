// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricRuleListResponseBody body;

    public static DescribeMetricRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleListResponse self = new DescribeMetricRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricRuleListResponse setBody(DescribeMetricRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleListResponseBody getBody() {
        return this.body;
    }

}
