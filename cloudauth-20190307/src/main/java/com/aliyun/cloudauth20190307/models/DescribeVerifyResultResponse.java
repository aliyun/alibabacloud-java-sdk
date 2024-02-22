// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyResultResponseBody body;

    public static DescribeVerifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyResultResponse self = new DescribeVerifyResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyResultResponse setBody(DescribeVerifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyResultResponseBody getBody() {
        return this.body;
    }

}
