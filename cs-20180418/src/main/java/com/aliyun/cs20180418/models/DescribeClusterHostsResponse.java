// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeClusterHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterHostsResponse self = new DescribeClusterHostsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
