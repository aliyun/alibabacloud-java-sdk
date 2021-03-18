// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDisksResponseBody body;

    public static DescribeDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponse self = new DescribeDisksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDisksResponse setBody(DescribeDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDisksResponseBody getBody() {
        return this.body;
    }

}
