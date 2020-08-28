// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserQuotaResponseBody body;

    public static DescribeUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserQuotaResponse self = new DescribeUserQuotaResponse();
        return TeaModel.build(map, self);
    }

}
