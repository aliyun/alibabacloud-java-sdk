// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConnectionStatusResponseBody body;

    public static DescribeConnectionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectionStatusResponse self = new DescribeConnectionStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConnectionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConnectionStatusResponse setBody(DescribeConnectionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConnectionStatusResponseBody getBody() {
        return this.body;
    }

}
