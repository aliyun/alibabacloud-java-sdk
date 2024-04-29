// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSystemLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSystemLogResponseBody body;

    public static DescribeSystemLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemLogResponse self = new DescribeSystemLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSystemLogResponse setBody(DescribeSystemLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemLogResponseBody getBody() {
        return this.body;
    }

}
