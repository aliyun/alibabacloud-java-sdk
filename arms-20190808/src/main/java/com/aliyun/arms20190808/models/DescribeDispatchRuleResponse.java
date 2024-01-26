// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDispatchRuleResponseBody body;

    public static DescribeDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDispatchRuleResponse self = new DescribeDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDispatchRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDispatchRuleResponse setBody(DescribeDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
