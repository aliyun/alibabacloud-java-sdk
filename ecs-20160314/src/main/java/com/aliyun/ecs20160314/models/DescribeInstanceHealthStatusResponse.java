// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceHealthStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceHealthStatusResponseBody body;

    public static DescribeInstanceHealthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHealthStatusResponse self = new DescribeInstanceHealthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHealthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceHealthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceHealthStatusResponse setBody(DescribeInstanceHealthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceHealthStatusResponseBody getBody() {
        return this.body;
    }

}
