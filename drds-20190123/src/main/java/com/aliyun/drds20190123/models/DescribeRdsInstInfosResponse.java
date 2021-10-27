// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsInstInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsInstInfosResponseBody body;

    public static DescribeRdsInstInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsInstInfosResponse self = new DescribeRdsInstInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsInstInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsInstInfosResponse setBody(DescribeRdsInstInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsInstInfosResponseBody getBody() {
        return this.body;
    }

}
