// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceIspsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePortViewSourceIspsResponseBody body;

    public static DescribePortViewSourceIspsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceIspsResponse self = new DescribePortViewSourceIspsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceIspsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortViewSourceIspsResponse setBody(DescribePortViewSourceIspsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortViewSourceIspsResponseBody getBody() {
        return this.body;
    }

}
