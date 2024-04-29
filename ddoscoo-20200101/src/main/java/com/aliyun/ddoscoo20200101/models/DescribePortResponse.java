// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortResponseBody body;

    public static DescribePortResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortResponse self = new DescribePortResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortResponse setBody(DescribePortResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortResponseBody getBody() {
        return this.body;
    }

}
