// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpcsResponseBody body;

    public static DescribeVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponse self = new DescribeVpcsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcsResponse setBody(DescribeVpcsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcsResponseBody getBody() {
        return this.body;
    }

}
