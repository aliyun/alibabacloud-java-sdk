// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAddonsResponseBody body;

    public static DescribeAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonsResponse self = new DescribeAddonsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddonsResponse setBody(DescribeAddonsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddonsResponseBody getBody() {
        return this.body;
    }

}
