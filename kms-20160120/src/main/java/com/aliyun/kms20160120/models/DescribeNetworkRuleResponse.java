// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkRuleResponseBody body;

    public static DescribeNetworkRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRuleResponse self = new DescribeNetworkRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkRuleResponse setBody(DescribeNetworkRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkRuleResponseBody getBody() {
        return this.body;
    }

}
