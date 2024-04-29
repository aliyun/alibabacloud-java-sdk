// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSpecsResponseBody body;

    public static DescribeInstanceSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecsResponse self = new DescribeInstanceSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSpecsResponse setBody(DescribeInstanceSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSpecsResponseBody getBody() {
        return this.body;
    }

}
