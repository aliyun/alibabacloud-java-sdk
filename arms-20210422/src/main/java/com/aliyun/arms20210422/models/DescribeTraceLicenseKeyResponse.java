// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DescribeTraceLicenseKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTraceLicenseKeyResponseBody body;

    public static DescribeTraceLicenseKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLicenseKeyResponse self = new DescribeTraceLicenseKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLicenseKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTraceLicenseKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTraceLicenseKeyResponse setBody(DescribeTraceLicenseKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTraceLicenseKeyResponseBody getBody() {
        return this.body;
    }

}
