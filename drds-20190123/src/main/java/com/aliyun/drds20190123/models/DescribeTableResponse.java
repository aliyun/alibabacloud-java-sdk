// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTableResponseBody body;

    public static DescribeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableResponse self = new DescribeTableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableResponse setBody(DescribeTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableResponseBody getBody() {
        return this.body;
    }

}
