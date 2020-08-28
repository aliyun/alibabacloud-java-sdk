// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterAddonsVersionResponseBody body;

    public static DescribeClusterAddonsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonsVersionResponse self = new DescribeClusterAddonsVersionResponse();
        return TeaModel.build(map, self);
    }

}
