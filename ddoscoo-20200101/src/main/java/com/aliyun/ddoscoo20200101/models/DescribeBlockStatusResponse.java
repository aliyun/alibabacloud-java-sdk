// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlockStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockStatusResponseBody body;

    public static DescribeBlockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockStatusResponse self = new DescribeBlockStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockStatusResponse setBody(DescribeBlockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockStatusResponseBody getBody() {
        return this.body;
    }

}
