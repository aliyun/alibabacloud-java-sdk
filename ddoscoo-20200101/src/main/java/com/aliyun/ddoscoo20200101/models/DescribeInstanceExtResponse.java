// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceExtResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceExtResponseBody body;

    public static DescribeInstanceExtResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceExtResponse self = new DescribeInstanceExtResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceExtResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceExtResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceExtResponse setBody(DescribeInstanceExtResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceExtResponseBody getBody() {
        return this.body;
    }

}
