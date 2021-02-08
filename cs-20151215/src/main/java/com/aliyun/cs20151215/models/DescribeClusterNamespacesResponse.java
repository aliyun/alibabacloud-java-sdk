// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeClusterNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNamespacesResponse self = new DescribeClusterNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
