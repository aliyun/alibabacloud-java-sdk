// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTemplatesResponseBody body;

    public static DescribeTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponse self = new DescribeTemplatesResponse();
        return TeaModel.build(map, self);
    }

}
