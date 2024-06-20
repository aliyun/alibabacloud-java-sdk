// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainTransactionResponseBody body;

    public static DescribeAntChainTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionResponse self = new DescribeAntChainTransactionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainTransactionResponse setBody(DescribeAntChainTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionResponseBody getBody() {
        return this.body;
    }

}
