// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeOrderAutoRebootTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOrderAutoRebootTimeResponseBody body;

    public static DescribeOrderAutoRebootTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderAutoRebootTimeResponse self = new DescribeOrderAutoRebootTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrderAutoRebootTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrderAutoRebootTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrderAutoRebootTimeResponse setBody(DescribeOrderAutoRebootTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrderAutoRebootTimeResponseBody getBody() {
        return this.body;
    }

}
