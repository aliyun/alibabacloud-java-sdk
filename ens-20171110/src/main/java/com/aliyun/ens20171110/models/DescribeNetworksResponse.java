// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworksResponseBody body;

    public static DescribeNetworksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworksResponse self = new DescribeNetworksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworksResponse setBody(DescribeNetworksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworksResponseBody getBody() {
        return this.body;
    }

}
