// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeLocationInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLocationInfoResponseBody body;

    public static DescribeLocationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocationInfoResponse self = new DescribeLocationInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLocationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLocationInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLocationInfoResponse setBody(DescribeLocationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLocationInfoResponseBody getBody() {
        return this.body;
    }

}
