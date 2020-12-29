// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeTraceLicenseKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTraceLicenseKeyResponseBody body;

    public static DescribeTraceLicenseKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLicenseKeyResponse self = new DescribeTraceLicenseKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLicenseKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTraceLicenseKeyResponse setBody(DescribeTraceLicenseKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTraceLicenseKeyResponseBody getBody() {
        return this.body;
    }

}
