// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpLocationServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpLocationServiceResponseBody body;

    public static DescribeIpLocationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpLocationServiceResponse self = new DescribeIpLocationServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpLocationServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpLocationServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpLocationServiceResponse setBody(DescribeIpLocationServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpLocationServiceResponseBody getBody() {
        return this.body;
    }

}
