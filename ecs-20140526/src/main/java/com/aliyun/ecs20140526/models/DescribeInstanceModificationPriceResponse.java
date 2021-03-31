// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceModificationPriceResponseBody body;

    public static DescribeInstanceModificationPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceModificationPriceResponse self = new DescribeInstanceModificationPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceModificationPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceModificationPriceResponse setBody(DescribeInstanceModificationPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceModificationPriceResponseBody getBody() {
        return this.body;
    }

}
