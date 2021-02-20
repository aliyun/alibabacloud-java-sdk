// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlsAuthStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlsAuthStatusResponseBody body;

    public static DescribeSlsAuthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAuthStatusResponse self = new DescribeSlsAuthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAuthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsAuthStatusResponse setBody(DescribeSlsAuthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsAuthStatusResponseBody getBody() {
        return this.body;
    }

}
