// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainCreationConfigOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockchainCreationConfigOptionsResponseBody body;

    public static DescribeBlockchainCreationConfigOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainCreationConfigOptionsResponse self = new DescribeBlockchainCreationConfigOptionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainCreationConfigOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockchainCreationConfigOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockchainCreationConfigOptionsResponse setBody(DescribeBlockchainCreationConfigOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockchainCreationConfigOptionsResponseBody getBody() {
        return this.body;
    }

}
