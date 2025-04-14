// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7GlobalRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeL7GlobalRuleResponseBody body;

    public static DescribeL7GlobalRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7GlobalRuleResponse self = new DescribeL7GlobalRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeL7GlobalRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeL7GlobalRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeL7GlobalRuleResponse setBody(DescribeL7GlobalRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeL7GlobalRuleResponseBody getBody() {
        return this.body;
    }

}
