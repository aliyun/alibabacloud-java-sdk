// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePreCheckStatusResponseBody body;

    public static DescribePreCheckStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckStatusResponse self = new DescribePreCheckStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePreCheckStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePreCheckStatusResponse setBody(DescribePreCheckStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePreCheckStatusResponseBody getBody() {
        return this.body;
    }

}
