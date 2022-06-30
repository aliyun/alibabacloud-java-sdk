// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkRulesResponseBody body;

    public static DescribeNetworkRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRulesResponse self = new DescribeNetworkRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkRulesResponse setBody(DescribeNetworkRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkRulesResponseBody getBody() {
        return this.body;
    }

}
