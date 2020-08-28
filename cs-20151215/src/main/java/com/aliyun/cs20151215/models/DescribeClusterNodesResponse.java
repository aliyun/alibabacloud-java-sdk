// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterNodesResponseBody body;

    public static DescribeClusterNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesResponse self = new DescribeClusterNodesResponse();
        return TeaModel.build(map, self);
    }

}
