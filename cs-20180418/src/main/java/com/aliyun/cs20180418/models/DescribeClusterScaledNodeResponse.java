// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterScaledNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeClusterScaledNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterScaledNodeResponse self = new DescribeClusterScaledNodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterScaledNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
