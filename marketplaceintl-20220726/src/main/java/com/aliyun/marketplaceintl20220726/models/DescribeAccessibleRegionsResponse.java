// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeAccessibleRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessibleRegionsResponseBody body;

    public static DescribeAccessibleRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessibleRegionsResponse self = new DescribeAccessibleRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessibleRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessibleRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessibleRegionsResponse setBody(DescribeAccessibleRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessibleRegionsResponseBody getBody() {
        return this.body;
    }

}
