// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribePreCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePreCheckResultResponseBody body;

    public static DescribePreCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckResultResponse self = new DescribePreCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePreCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePreCheckResultResponse setBody(DescribePreCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePreCheckResultResponseBody getBody() {
        return this.body;
    }

}
