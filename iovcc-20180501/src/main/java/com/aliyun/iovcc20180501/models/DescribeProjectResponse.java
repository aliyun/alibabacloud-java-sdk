// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectResponseBody body;

    public static DescribeProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectResponse self = new DescribeProjectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectResponse setBody(DescribeProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectResponseBody getBody() {
        return this.body;
    }

}
