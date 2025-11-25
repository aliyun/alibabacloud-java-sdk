// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTimeTopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetTimeTopResponseBody body;

    public static DescribeInternetTimeTopResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetTimeTopResponse self = new DescribeInternetTimeTopResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetTimeTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetTimeTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetTimeTopResponse setBody(DescribeInternetTimeTopResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetTimeTopResponseBody getBody() {
        return this.body;
    }

}
