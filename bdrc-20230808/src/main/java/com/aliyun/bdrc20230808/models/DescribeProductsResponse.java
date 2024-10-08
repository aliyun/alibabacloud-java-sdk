// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductsResponseBody body;

    public static DescribeProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsResponse self = new DescribeProductsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductsResponse setBody(DescribeProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductsResponseBody getBody() {
        return this.body;
    }

}
