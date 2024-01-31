// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterNodesResponseBody body;

    public static DescribeClusterNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesResponse self = new DescribeClusterNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterNodesResponse setBody(DescribeClusterNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterNodesResponseBody getBody() {
        return this.body;
    }

}
