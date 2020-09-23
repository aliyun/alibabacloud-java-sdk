// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterAddonsVersionResponseBody body;

    public static DescribeClusterAddonsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonsVersionResponse self = new DescribeClusterAddonsVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterAddonsVersionResponse setBody(DescribeClusterAddonsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterAddonsVersionResponseBody getBody() {
        return this.body;
    }

}
