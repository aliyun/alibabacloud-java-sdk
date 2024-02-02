// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceStatusResponseBody body;

    public static DescribeInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusResponse self = new DescribeInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceStatusResponse setBody(DescribeInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
