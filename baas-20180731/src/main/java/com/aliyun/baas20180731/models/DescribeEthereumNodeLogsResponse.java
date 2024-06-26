// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodeLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumNodeLogsResponseBody body;

    public static DescribeEthereumNodeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodeLogsResponse self = new DescribeEthereumNodeLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumNodeLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumNodeLogsResponse setBody(DescribeEthereumNodeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumNodeLogsResponseBody getBody() {
        return this.body;
    }

}
