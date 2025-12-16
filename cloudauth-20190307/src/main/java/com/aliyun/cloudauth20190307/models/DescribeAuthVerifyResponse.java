// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAuthVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuthVerifyResponseBody body;

    public static DescribeAuthVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthVerifyResponse self = new DescribeAuthVerifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthVerifyResponse setBody(DescribeAuthVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthVerifyResponseBody getBody() {
        return this.body;
    }

}
