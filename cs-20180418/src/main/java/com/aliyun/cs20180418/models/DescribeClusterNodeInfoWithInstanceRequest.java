// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterNodeInfoWithInstanceRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeClusterNodeInfoWithInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodeInfoWithInstanceRequest self = new DescribeClusterNodeInfoWithInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodeInfoWithInstanceRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
