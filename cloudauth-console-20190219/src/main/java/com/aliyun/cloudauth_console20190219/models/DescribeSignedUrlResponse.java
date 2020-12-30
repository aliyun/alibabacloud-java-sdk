// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSignedUrlResponseBody body;

    public static DescribeSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedUrlResponse self = new DescribeSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSignedUrlResponse setBody(DescribeSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSignedUrlResponseBody getBody() {
        return this.body;
    }

}
