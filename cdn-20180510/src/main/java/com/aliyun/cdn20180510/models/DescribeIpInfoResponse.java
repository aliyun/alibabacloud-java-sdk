// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIpInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpInfoResponseBody body;

    public static DescribeIpInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpInfoResponse self = new DescribeIpInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpInfoResponse setBody(DescribeIpInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpInfoResponseBody getBody() {
        return this.body;
    }

}
