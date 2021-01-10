// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeProductOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProductOpenStatusResponseBody body;

    public static DescribeProductOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductOpenStatusResponse self = new DescribeProductOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductOpenStatusResponse setBody(DescribeProductOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductOpenStatusResponseBody getBody() {
        return this.body;
    }

}
