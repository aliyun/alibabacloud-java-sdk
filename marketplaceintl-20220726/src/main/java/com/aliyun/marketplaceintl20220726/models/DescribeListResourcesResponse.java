// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeListResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeListResourcesResponseBody body;

    public static DescribeListResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListResourcesResponse self = new DescribeListResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeListResourcesResponse setBody(DescribeListResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListResourcesResponseBody getBody() {
        return this.body;
    }

}
