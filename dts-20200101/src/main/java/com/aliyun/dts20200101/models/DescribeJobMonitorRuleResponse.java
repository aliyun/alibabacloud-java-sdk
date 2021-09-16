// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeJobMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeJobMonitorRuleResponse setBody(DescribeJobMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
