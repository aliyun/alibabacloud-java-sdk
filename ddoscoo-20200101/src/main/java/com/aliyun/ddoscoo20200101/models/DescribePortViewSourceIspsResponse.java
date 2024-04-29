// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceIspsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortViewSourceIspsResponseBody body;

    public static DescribePortViewSourceIspsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceIspsResponse self = new DescribePortViewSourceIspsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceIspsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortViewSourceIspsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortViewSourceIspsResponse setBody(DescribePortViewSourceIspsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortViewSourceIspsResponseBody getBody() {
        return this.body;
    }

}
