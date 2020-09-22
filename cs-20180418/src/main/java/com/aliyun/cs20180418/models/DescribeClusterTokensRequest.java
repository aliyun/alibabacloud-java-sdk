// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterTokensRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeClusterTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterTokensRequest self = new DescribeClusterTokensRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterTokensRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
