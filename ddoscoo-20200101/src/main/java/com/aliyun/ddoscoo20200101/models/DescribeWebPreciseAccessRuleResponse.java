// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebPreciseAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebPreciseAccessRuleResponseBody body;

    public static DescribeWebPreciseAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPreciseAccessRuleResponse self = new DescribeWebPreciseAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebPreciseAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebPreciseAccessRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebPreciseAccessRuleResponse setBody(DescribeWebPreciseAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebPreciseAccessRuleResponseBody getBody() {
        return this.body;
    }

}
