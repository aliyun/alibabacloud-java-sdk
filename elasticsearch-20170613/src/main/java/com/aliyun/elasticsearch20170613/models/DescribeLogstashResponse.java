// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeLogstashResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogstashResponseBody body;

    public static DescribeLogstashResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstashResponse self = new DescribeLogstashResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogstashResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogstashResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogstashResponse setBody(DescribeLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogstashResponseBody getBody() {
        return this.body;
    }

}
