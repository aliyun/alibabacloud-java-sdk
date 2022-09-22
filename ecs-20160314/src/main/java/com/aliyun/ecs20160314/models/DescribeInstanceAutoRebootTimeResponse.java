// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRebootTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceAutoRebootTimeResponseBody body;

    public static DescribeInstanceAutoRebootTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRebootTimeResponse self = new DescribeInstanceAutoRebootTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRebootTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAutoRebootTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAutoRebootTimeResponse setBody(DescribeInstanceAutoRebootTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAutoRebootTimeResponseBody getBody() {
        return this.body;
    }

}
