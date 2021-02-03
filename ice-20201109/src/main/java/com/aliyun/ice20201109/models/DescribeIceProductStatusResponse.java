// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeIceProductStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIceProductStatusResponseBody body;

    public static DescribeIceProductStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceProductStatusResponse self = new DescribeIceProductStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIceProductStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIceProductStatusResponse setBody(DescribeIceProductStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIceProductStatusResponseBody getBody() {
        return this.body;
    }

}
