// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSubnetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubnetsResponseBody body;

    public static DescribeSubnetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubnetsResponse self = new DescribeSubnetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubnetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubnetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubnetsResponse setBody(DescribeSubnetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubnetsResponseBody getBody() {
        return this.body;
    }

}
