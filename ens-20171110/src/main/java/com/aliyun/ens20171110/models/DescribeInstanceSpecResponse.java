// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceSpecResponseBody body;

    public static DescribeInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecResponse self = new DescribeInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSpecResponse setBody(DescribeInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
