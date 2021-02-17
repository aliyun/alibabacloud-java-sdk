// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeShardingNetworkAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeShardingNetworkAddressResponse setBody(DescribeShardingNetworkAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShardingNetworkAddressResponseBody getBody() {
        return this.body;
    }

}
