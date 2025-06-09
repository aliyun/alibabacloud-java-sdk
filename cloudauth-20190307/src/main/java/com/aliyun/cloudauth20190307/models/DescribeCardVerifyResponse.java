// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeCardVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCardVerifyResponseBody body;

    public static DescribeCardVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCardVerifyResponse self = new DescribeCardVerifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCardVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCardVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCardVerifyResponse setBody(DescribeCardVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCardVerifyResponseBody getBody() {
        return this.body;
    }

}
