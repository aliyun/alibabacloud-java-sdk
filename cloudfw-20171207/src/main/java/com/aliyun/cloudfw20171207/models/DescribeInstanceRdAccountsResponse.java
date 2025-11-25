// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRdAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceRdAccountsResponseBody body;

    public static DescribeInstanceRdAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRdAccountsResponse self = new DescribeInstanceRdAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRdAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceRdAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceRdAccountsResponse setBody(DescribeInstanceRdAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceRdAccountsResponseBody getBody() {
        return this.body;
    }

}
