// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterCertsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeClusterCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterCertsResponse self = new DescribeClusterCertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
