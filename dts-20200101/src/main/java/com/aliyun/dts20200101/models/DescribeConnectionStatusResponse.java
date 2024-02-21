// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConnectionStatusResponseBody body;

    public static DescribeConnectionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectionStatusResponse self = new DescribeConnectionStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConnectionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConnectionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConnectionStatusResponse setBody(DescribeConnectionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConnectionStatusResponseBody getBody() {
        return this.body;
    }

}
