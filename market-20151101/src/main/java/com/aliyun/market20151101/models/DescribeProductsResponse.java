// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeProductsResponse setBody(DescribeProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductsResponseBody getBody() {
        return this.body;
    }

}
