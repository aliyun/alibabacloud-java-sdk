// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAckClusterNamespacesResponseBody body;

    public static DescribeAckClusterNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterNamespacesResponse self = new DescribeAckClusterNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAckClusterNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAckClusterNamespacesResponse setBody(DescribeAckClusterNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAckClusterNamespacesResponseBody getBody() {
        return this.body;
    }

}
