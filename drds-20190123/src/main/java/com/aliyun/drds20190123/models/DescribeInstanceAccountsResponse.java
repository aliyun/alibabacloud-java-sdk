// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceAccountsResponseBody body;

    public static DescribeInstanceAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAccountsResponse self = new DescribeInstanceAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAccountsResponse setBody(DescribeInstanceAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAccountsResponseBody getBody() {
        return this.body;
    }

}
