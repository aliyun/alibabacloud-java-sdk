// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSpecResponseBody body;

    public static DescribeInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecResponse self = new DescribeInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSpecResponse setBody(DescribeInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
