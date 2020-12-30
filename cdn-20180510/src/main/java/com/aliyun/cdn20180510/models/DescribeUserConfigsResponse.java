// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserConfigsResponseBody body;

    public static DescribeUserConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConfigsResponse self = new DescribeUserConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserConfigsResponse setBody(DescribeUserConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserConfigsResponseBody getBody() {
        return this.body;
    }

}
