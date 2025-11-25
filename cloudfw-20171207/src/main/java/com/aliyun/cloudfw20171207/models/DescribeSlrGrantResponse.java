// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSlrGrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlrGrantResponseBody body;

    public static DescribeSlrGrantResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlrGrantResponse self = new DescribeSlrGrantResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlrGrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlrGrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlrGrantResponse setBody(DescribeSlrGrantResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlrGrantResponseBody getBody() {
        return this.body;
    }

}
