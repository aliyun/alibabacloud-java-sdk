// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeApiVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiVersionResponseBody body;

    public static DescribeApiVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiVersionResponse self = new DescribeApiVersionResponse();
        return TeaModel.build(map, self);
    }

}
