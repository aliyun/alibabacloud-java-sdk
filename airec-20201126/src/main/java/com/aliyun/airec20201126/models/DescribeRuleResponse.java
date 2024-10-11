// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleResponseBody body;

    public static DescribeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleResponse self = new DescribeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleResponse setBody(DescribeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleResponseBody getBody() {
        return this.body;
    }

}
