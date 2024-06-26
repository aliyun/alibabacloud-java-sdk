// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodeConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumNodeConfigurationResponseBody body;

    public static DescribeEthereumNodeConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodeConfigurationResponse self = new DescribeEthereumNodeConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodeConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumNodeConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumNodeConfigurationResponse setBody(DescribeEthereumNodeConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumNodeConfigurationResponseBody getBody() {
        return this.body;
    }

}
