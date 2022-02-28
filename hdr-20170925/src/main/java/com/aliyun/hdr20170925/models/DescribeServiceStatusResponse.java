// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceStatusResponseBody body;

    public static DescribeServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceStatusResponse self = new DescribeServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceStatusResponse setBody(DescribeServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceStatusResponseBody getBody() {
        return this.body;
    }

}
