// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInternetOpenIpResponseBody body;

    public static DescribeInternetOpenIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenIpResponse self = new DescribeInternetOpenIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetOpenIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetOpenIpResponse setBody(DescribeInternetOpenIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetOpenIpResponseBody getBody() {
        return this.body;
    }

}
