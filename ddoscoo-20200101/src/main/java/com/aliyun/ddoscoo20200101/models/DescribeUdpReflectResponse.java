// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUdpReflectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUdpReflectResponseBody body;

    public static DescribeUdpReflectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUdpReflectResponse self = new DescribeUdpReflectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUdpReflectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUdpReflectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUdpReflectResponse setBody(DescribeUdpReflectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUdpReflectResponseBody getBody() {
        return this.body;
    }

}
