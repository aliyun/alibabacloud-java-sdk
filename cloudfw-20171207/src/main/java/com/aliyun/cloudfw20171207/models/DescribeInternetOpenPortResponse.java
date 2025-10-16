// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenPortResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetOpenPortResponseBody body;

    public static DescribeInternetOpenPortResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenPortResponse self = new DescribeInternetOpenPortResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetOpenPortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetOpenPortResponse setBody(DescribeInternetOpenPortResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetOpenPortResponseBody getBody() {
        return this.body;
    }

}
