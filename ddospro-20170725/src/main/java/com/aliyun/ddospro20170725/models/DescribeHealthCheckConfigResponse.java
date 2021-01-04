// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHealthCheckConfigResponseBody body;

    public static DescribeHealthCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckConfigResponse self = new DescribeHealthCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthCheckConfigResponse setBody(DescribeHealthCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthCheckConfigResponseBody getBody() {
        return this.body;
    }

}
