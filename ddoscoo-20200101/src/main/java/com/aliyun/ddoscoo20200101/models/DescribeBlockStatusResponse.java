// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlockStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBlockStatusResponseBody body;

    public static DescribeBlockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockStatusResponse self = new DescribeBlockStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockStatusResponse setBody(DescribeBlockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockStatusResponseBody getBody() {
        return this.body;
    }

}
