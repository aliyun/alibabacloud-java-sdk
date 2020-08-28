// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<DescribeClusterResourcesResponseBody> body;

    public static DescribeClusterResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourcesResponse self = new DescribeClusterResourcesResponse();
        return TeaModel.build(map, self);
    }

}
