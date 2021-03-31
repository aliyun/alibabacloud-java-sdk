// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersForPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody body;

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersForPhysicalConnectionResponse self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setBody(DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
