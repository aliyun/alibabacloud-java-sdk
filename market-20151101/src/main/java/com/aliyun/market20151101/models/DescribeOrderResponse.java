// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeOrderResponse setBody(DescribeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrderResponseBody getBody() {
        return this.body;
    }

}
