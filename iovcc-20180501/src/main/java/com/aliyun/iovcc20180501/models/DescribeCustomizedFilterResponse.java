// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeCustomizedFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomizedFilterResponseBody body;

    public static DescribeCustomizedFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedFilterResponse self = new DescribeCustomizedFilterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizedFilterResponse setBody(DescribeCustomizedFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizedFilterResponseBody getBody() {
        return this.body;
    }

}
