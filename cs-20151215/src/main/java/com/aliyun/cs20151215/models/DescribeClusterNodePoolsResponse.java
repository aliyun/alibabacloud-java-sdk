// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeClusterNodePoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterNodePoolsResponse setBody(DescribeClusterNodePoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterNodePoolsResponseBody getBody() {
        return this.body;
    }

}
