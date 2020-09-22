// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeUserContainersRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DescribeUserContainersQuery query;

    public static DescribeUserContainersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserContainersRequest self = new DescribeUserContainersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserContainersRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserContainersRequest setQuery(DescribeUserContainersQuery query) {
        this.query = query;
        return this;
    }
    public DescribeUserContainersQuery getQuery() {
        return this.query;
    }

}
