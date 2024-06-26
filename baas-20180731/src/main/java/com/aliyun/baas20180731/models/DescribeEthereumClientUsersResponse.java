// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumClientUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumClientUsersResponseBody body;

    public static DescribeEthereumClientUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumClientUsersResponse self = new DescribeEthereumClientUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumClientUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumClientUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumClientUsersResponse setBody(DescribeEthereumClientUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumClientUsersResponseBody getBody() {
        return this.body;
    }

}
