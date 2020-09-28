// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterNodePoolsResponseBody body;

    public static DescribeClusterNodePoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolsResponse self = new DescribeClusterNodePoolsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterNodePoolsResponse setBody(DescribeClusterNodePoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterNodePoolsResponseBody getBody() {
        return this.body;
    }

}
