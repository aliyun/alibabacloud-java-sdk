// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribePayOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePayOrdersResponseBody body;

    public static DescribePayOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePayOrdersResponse self = new DescribePayOrdersResponse();
        return TeaModel.build(map, self);
    }

    public DescribePayOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePayOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePayOrdersResponse setBody(DescribePayOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePayOrdersResponseBody getBody() {
        return this.body;
    }

}
