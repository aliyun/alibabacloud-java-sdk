// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClustersResponseBody body;

    public static DescribeDBClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersResponse self = new DescribeDBClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClustersResponse setBody(DescribeDBClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClustersResponseBody getBody() {
        return this.body;
    }

}
