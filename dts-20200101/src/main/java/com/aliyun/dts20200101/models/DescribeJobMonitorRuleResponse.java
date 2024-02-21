// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeJobMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobMonitorRuleResponseBody body;

    public static DescribeJobMonitorRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMonitorRuleResponse self = new DescribeJobMonitorRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobMonitorRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobMonitorRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobMonitorRuleResponse setBody(DescribeJobMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
