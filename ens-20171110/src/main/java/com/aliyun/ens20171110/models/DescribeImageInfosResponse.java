// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageInfosResponseBody body;

    public static DescribeImageInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInfosResponse self = new DescribeImageInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageInfosResponse setBody(DescribeImageInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageInfosResponseBody getBody() {
        return this.body;
    }

}
