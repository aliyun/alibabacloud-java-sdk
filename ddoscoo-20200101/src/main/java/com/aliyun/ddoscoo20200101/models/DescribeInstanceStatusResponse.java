// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceStatusResponseBody body;

    public static DescribeInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusResponse self = new DescribeInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStatusResponse setBody(DescribeInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
