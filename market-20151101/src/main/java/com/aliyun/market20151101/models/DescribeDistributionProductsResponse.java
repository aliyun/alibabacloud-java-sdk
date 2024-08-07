// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDistributionProductsResponseBody body;

    public static DescribeDistributionProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributionProductsResponse self = new DescribeDistributionProductsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDistributionProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDistributionProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDistributionProductsResponse setBody(DescribeDistributionProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDistributionProductsResponseBody getBody() {
        return this.body;
    }

}
