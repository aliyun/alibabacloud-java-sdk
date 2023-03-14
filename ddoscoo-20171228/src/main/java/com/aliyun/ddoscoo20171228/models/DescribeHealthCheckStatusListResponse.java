// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHealthCheckStatusListResponseBody body;

    public static DescribeHealthCheckStatusListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusListResponse self = new DescribeHealthCheckStatusListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthCheckStatusListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHealthCheckStatusListResponse setBody(DescribeHealthCheckStatusListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthCheckStatusListResponseBody getBody() {
        return this.body;
    }

}
