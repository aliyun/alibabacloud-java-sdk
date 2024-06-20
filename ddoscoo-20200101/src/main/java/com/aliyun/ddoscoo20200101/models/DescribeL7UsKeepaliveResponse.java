// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7UsKeepaliveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeL7UsKeepaliveResponseBody body;

    public static DescribeL7UsKeepaliveResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7UsKeepaliveResponse self = new DescribeL7UsKeepaliveResponse();
        return TeaModel.build(map, self);
    }

    public DescribeL7UsKeepaliveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeL7UsKeepaliveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeL7UsKeepaliveResponse setBody(DescribeL7UsKeepaliveResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeL7UsKeepaliveResponseBody getBody() {
        return this.body;
    }

}
