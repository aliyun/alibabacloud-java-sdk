// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterLogsResponseBody body;

    public static DescribeClusterLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterLogsResponse self = new DescribeClusterLogsResponse();
        return TeaModel.build(map, self);
    }

}
