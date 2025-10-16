// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetDropTrafficTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetDropTrafficTrendResponseBody body;

    public static DescribeInternetDropTrafficTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetDropTrafficTrendResponse self = new DescribeInternetDropTrafficTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetDropTrafficTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetDropTrafficTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetDropTrafficTrendResponse setBody(DescribeInternetDropTrafficTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetDropTrafficTrendResponseBody getBody() {
        return this.body;
    }

}
