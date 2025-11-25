// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUnprotectedPortTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUnprotectedPortTrendResponseBody body;

    public static DescribeUnprotectedPortTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnprotectedPortTrendResponse self = new DescribeUnprotectedPortTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnprotectedPortTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUnprotectedPortTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUnprotectedPortTrendResponse setBody(DescribeUnprotectedPortTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnprotectedPortTrendResponseBody getBody() {
        return this.body;
    }

}
