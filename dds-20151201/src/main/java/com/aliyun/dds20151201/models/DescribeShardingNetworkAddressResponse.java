// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeShardingNetworkAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeShardingNetworkAddressResponseBody body;

    public static DescribeShardingNetworkAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardingNetworkAddressResponse self = new DescribeShardingNetworkAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShardingNetworkAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShardingNetworkAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeShardingNetworkAddressResponse setBody(DescribeShardingNetworkAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShardingNetworkAddressResponseBody getBody() {
        return this.body;
    }

}
