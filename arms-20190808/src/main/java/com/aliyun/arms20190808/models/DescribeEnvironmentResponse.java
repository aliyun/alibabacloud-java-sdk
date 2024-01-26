// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnvironmentResponseBody body;

    public static DescribeEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvironmentResponse self = new DescribeEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnvironmentResponse setBody(DescribeEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnvironmentResponseBody getBody() {
        return this.body;
    }

}
