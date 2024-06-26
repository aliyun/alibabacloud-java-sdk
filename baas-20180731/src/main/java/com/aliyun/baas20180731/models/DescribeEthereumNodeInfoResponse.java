// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumNodeInfoResponseBody body;

    public static DescribeEthereumNodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodeInfoResponse self = new DescribeEthereumNodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumNodeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumNodeInfoResponse setBody(DescribeEthereumNodeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumNodeInfoResponseBody getBody() {
        return this.body;
    }

}
