// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransactionResponseBody body;

    public static DescribeTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionResponse self = new DescribeTransactionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransactionResponse setBody(DescribeTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransactionResponseBody getBody() {
        return this.body;
    }

}
