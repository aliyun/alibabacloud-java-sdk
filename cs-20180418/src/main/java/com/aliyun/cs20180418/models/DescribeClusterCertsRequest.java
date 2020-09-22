// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterCertsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeClusterCertsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterCertsRequest self = new DescribeClusterCertsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterCertsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
