// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDBClusterNetInfoItemsResponse setBody(DescribeDBClusterNetInfoItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterNetInfoItemsResponseBody getBody() {
        return this.body;
    }

}
