// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMessageResponseBody body;

    public static DescribeMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMessageResponse self = new DescribeMessageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMessageResponse setBody(DescribeMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMessageResponseBody getBody() {
        return this.body;
    }

}
