// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DescribeClusterNodesQuery query;

    public static DescribeClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesRequest self = new DescribeClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterNodesRequest setQuery(DescribeClusterNodesQuery query) {
        this.query = query;
        return this;
    }
    public DescribeClusterNodesQuery getQuery() {
        return this.query;
    }

}
