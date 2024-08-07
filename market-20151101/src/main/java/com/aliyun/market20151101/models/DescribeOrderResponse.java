// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrderResponseBody body;

    public static DescribeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderResponse self = new DescribeOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrderResponse setBody(DescribeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrderResponseBody getBody() {
        return this.body;
    }

}
