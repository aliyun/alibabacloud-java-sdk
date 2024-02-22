// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveMetricRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActiveMetricRuleListResponseBody body;

    public static DescribeActiveMetricRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveMetricRuleListResponse self = new DescribeActiveMetricRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveMetricRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveMetricRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveMetricRuleListResponse setBody(DescribeActiveMetricRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveMetricRuleListResponseBody getBody() {
        return this.body;
    }

}
