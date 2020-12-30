// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterConnectionsResponseBody body;

    public static DescribeClusterConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionsResponse self = new DescribeClusterConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterConnectionsResponse setBody(DescribeClusterConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterConnectionsResponseBody getBody() {
        return this.body;
    }

}
