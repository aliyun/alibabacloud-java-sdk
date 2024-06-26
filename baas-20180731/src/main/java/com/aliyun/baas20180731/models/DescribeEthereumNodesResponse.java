// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumNodesResponseBody body;

    public static DescribeEthereumNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodesResponse self = new DescribeEthereumNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumNodesResponse setBody(DescribeEthereumNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumNodesResponseBody getBody() {
        return this.body;
    }

}
