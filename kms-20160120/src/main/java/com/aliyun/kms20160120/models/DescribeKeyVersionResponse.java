// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeKeyVersionResponseBody body;

    public static DescribeKeyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyVersionResponse self = new DescribeKeyVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKeyVersionResponse setBody(DescribeKeyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKeyVersionResponseBody getBody() {
        return this.body;
    }

}
