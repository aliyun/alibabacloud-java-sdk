// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeOsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOsVersionResponseBody body;

    public static DescribeOsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOsVersionResponse self = new DescribeOsVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOsVersionResponse setBody(DescribeOsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOsVersionResponseBody getBody() {
        return this.body;
    }

}
