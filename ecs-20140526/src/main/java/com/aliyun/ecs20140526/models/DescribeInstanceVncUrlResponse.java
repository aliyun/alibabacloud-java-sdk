// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceVncUrlResponseBody body;

    public static DescribeInstanceVncUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVncUrlResponse self = new DescribeInstanceVncUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVncUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceVncUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceVncUrlResponse setBody(DescribeInstanceVncUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceVncUrlResponseBody getBody() {
        return this.body;
    }

}
