// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceNewConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceNewConnectionsResponseBody body;

    public static DescribeInstanceNewConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceNewConnectionsResponse self = new DescribeInstanceNewConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceNewConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceNewConnectionsResponse setBody(DescribeInstanceNewConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceNewConnectionsResponseBody getBody() {
        return this.body;
    }

}
