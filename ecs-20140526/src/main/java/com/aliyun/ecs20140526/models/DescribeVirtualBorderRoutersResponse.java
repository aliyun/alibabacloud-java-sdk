// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVirtualBorderRoutersResponseBody body;

    public static DescribeVirtualBorderRoutersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersResponse self = new DescribeVirtualBorderRoutersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualBorderRoutersResponse setBody(DescribeVirtualBorderRoutersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualBorderRoutersResponseBody getBody() {
        return this.body;
    }

}
