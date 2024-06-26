// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainConfigOptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockchainConfigOptionResponseBody body;

    public static DescribeBlockchainConfigOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainConfigOptionResponse self = new DescribeBlockchainConfigOptionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainConfigOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockchainConfigOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockchainConfigOptionResponse setBody(DescribeBlockchainConfigOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockchainConfigOptionResponseBody getBody() {
        return this.body;
    }

}
