// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityModeResponseBody body;

    public static DescribeSecurityModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityModeResponse self = new DescribeSecurityModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityModeResponse setBody(DescribeSecurityModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityModeResponseBody getBody() {
        return this.body;
    }

}
