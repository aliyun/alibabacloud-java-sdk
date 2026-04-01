// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkPeerConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkPeerConnectionsResponseBody body;

    public static DescribeNetworkPeerConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPeerConnectionsResponse self = new DescribeNetworkPeerConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPeerConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkPeerConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkPeerConnectionsResponse setBody(DescribeNetworkPeerConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkPeerConnectionsResponseBody getBody() {
        return this.body;
    }

}
