// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTrendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInternetTrafficTrendResponseBody body;

    public static DescribeInternetTrafficTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetTrafficTrendResponse self = new DescribeInternetTrafficTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetTrafficTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetTrafficTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetTrafficTrendResponse setBody(DescribeInternetTrafficTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetTrafficTrendResponseBody getBody() {
        return this.body;
    }

}
