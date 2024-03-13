// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourcePackageProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourcePackageProductResponseBody body;

    public static DescribeResourcePackageProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackageProductResponse self = new DescribeResourcePackageProductResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackageProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcePackageProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourcePackageProductResponse setBody(DescribeResourcePackageProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcePackageProductResponseBody getBody() {
        return this.body;
    }

}
