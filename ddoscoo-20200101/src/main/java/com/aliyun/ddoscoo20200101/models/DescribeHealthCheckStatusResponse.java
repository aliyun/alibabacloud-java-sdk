// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHealthCheckStatusResponseBody body;

    public static DescribeHealthCheckStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusResponse self = new DescribeHealthCheckStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthCheckStatusResponse setBody(DescribeHealthCheckStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthCheckStatusResponseBody getBody() {
        return this.body;
    }

}
