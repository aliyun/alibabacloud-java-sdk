// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodeInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterNodeInfosResponseBody body;

    public static DescribeDBClusterNodeInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNodeInfosResponse self = new DescribeDBClusterNodeInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNodeInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterNodeInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterNodeInfosResponse setBody(DescribeDBClusterNodeInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterNodeInfosResponseBody getBody() {
        return this.body;
    }

}
