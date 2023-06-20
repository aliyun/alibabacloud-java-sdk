// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDistributionProductsLinkResponseBody body;

    public static DescribeDistributionProductsLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributionProductsLinkResponse self = new DescribeDistributionProductsLinkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDistributionProductsLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDistributionProductsLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDistributionProductsLinkResponse setBody(DescribeDistributionProductsLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDistributionProductsLinkResponseBody getBody() {
        return this.body;
    }

}
