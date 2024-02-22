// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricRuleBlackListResponseBody body;

    public static DescribeMetricRuleBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleBlackListResponse self = new DescribeMetricRuleBlackListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricRuleBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricRuleBlackListResponse setBody(DescribeMetricRuleBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

}
