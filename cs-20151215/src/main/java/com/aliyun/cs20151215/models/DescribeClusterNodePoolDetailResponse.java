// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterNodePoolDetailResponseBody body;

    public static DescribeClusterNodePoolDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolDetailResponse self = new DescribeClusterNodePoolDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterNodePoolDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterNodePoolDetailResponse setBody(DescribeClusterNodePoolDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBody getBody() {
        return this.body;
    }

}
