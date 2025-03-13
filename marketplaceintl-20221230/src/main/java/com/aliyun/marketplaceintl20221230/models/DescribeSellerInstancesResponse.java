// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class DescribeSellerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSellerInstancesResponseBody body;

    public static DescribeSellerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSellerInstancesResponse self = new DescribeSellerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSellerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSellerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSellerInstancesResponse setBody(DescribeSellerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSellerInstancesResponseBody getBody() {
        return this.body;
    }

}
