// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSessionResponseBody body;

    public static DescribeSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionResponse self = new DescribeSessionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSessionResponse setBody(DescribeSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSessionResponseBody getBody() {
        return this.body;
    }

}
