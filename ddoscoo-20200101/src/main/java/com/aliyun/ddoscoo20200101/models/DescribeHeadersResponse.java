// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHeadersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHeadersResponseBody body;

    public static DescribeHeadersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHeadersResponse self = new DescribeHeadersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHeadersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHeadersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHeadersResponse setBody(DescribeHeadersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHeadersResponseBody getBody() {
        return this.body;
    }

}
