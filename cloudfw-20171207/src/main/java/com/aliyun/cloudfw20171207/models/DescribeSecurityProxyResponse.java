// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityProxyResponseBody body;

    public static DescribeSecurityProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityProxyResponse self = new DescribeSecurityProxyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityProxyResponse setBody(DescribeSecurityProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityProxyResponseBody getBody() {
        return this.body;
    }

}
