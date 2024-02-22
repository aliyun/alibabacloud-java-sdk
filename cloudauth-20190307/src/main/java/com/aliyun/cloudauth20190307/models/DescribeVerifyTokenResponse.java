// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyTokenResponseBody body;

    public static DescribeVerifyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenResponse self = new DescribeVerifyTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyTokenResponse setBody(DescribeVerifyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyTokenResponseBody getBody() {
        return this.body;
    }

}
