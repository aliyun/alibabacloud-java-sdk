// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageComponentsResponseBody body;

    public static DescribeImageComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageComponentsResponse self = new DescribeImageComponentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageComponentsResponse setBody(DescribeImageComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageComponentsResponseBody getBody() {
        return this.body;
    }

}
