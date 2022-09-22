// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribePrivatePoolsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePrivatePoolsResponseBody body;

    public static DescribePrivatePoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivatePoolsResponse self = new DescribePrivatePoolsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrivatePoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrivatePoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrivatePoolsResponse setBody(DescribePrivatePoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrivatePoolsResponseBody getBody() {
        return this.body;
    }

}
