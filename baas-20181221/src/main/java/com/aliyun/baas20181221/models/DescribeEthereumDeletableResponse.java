// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeEthereumDeletableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEthereumDeletableResponseBody body;

    public static DescribeEthereumDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumDeletableResponse self = new DescribeEthereumDeletableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumDeletableResponse setBody(DescribeEthereumDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumDeletableResponseBody getBody() {
        return this.body;
    }

}
