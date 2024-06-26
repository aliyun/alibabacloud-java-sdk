// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumNodeResponseBody body;

    public static DescribeEthereumNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodeResponse self = new DescribeEthereumNodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumNodeResponse setBody(DescribeEthereumNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumNodeResponseBody getBody() {
        return this.body;
    }

}
