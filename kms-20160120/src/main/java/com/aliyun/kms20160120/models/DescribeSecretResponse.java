// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecretResponseBody body;

    public static DescribeSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretResponse self = new DescribeSecretResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecretResponse setBody(DescribeSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecretResponseBody getBody() {
        return this.body;
    }

}
