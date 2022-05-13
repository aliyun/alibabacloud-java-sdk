// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeHardwareTerminalsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHardwareTerminalsResponseBody body;

    public static DescribeHardwareTerminalsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHardwareTerminalsResponse self = new DescribeHardwareTerminalsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHardwareTerminalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHardwareTerminalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHardwareTerminalsResponse setBody(DescribeHardwareTerminalsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHardwareTerminalsResponseBody getBody() {
        return this.body;
    }

}
