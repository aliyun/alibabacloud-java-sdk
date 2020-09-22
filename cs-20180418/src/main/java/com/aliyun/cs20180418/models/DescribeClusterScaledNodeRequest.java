// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterScaledNodeRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeClusterScaledNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterScaledNodeRequest self = new DescribeClusterScaledNodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterScaledNodeRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
