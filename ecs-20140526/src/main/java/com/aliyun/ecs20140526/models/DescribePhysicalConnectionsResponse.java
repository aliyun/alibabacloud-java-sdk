// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePhysicalConnectionsResponseBody body;

    public static DescribePhysicalConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsResponse self = new DescribePhysicalConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhysicalConnectionsResponse setBody(DescribePhysicalConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhysicalConnectionsResponseBody getBody() {
        return this.body;
    }

}
