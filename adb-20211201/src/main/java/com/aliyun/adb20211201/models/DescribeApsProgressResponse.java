// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsProgressResponseBody body;

    public static DescribeApsProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsProgressResponse self = new DescribeApsProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsProgressResponse setBody(DescribeApsProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsProgressResponseBody getBody() {
        return this.body;
    }

}
