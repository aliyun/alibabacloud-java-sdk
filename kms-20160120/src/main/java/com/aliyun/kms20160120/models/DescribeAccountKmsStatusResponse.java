// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeAccountKmsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountKmsStatusResponseBody body;

    public static DescribeAccountKmsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountKmsStatusResponse self = new DescribeAccountKmsStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountKmsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountKmsStatusResponse setBody(DescribeAccountKmsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountKmsStatusResponseBody getBody() {
        return this.body;
    }

}
