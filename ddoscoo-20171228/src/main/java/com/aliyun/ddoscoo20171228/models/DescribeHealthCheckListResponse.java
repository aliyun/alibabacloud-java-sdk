// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHealthCheckListResponseBody body;

    public static DescribeHealthCheckListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckListResponse self = new DescribeHealthCheckListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthCheckListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHealthCheckListResponse setBody(DescribeHealthCheckListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthCheckListResponseBody getBody() {
        return this.body;
    }

}
