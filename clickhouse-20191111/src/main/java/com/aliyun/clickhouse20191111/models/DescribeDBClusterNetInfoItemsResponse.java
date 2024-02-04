// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterNetInfoItemsResponseBody body;

    public static DescribeDBClusterNetInfoItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNetInfoItemsResponse self = new DescribeDBClusterNetInfoItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNetInfoItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterNetInfoItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterNetInfoItemsResponse setBody(DescribeDBClusterNetInfoItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterNetInfoItemsResponseBody getBody() {
        return this.body;
    }

}
