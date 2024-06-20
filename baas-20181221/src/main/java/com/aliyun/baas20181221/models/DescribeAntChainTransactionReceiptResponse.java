// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainTransactionReceiptResponseBody body;

    public static DescribeAntChainTransactionReceiptResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptResponse self = new DescribeAntChainTransactionReceiptResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionReceiptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainTransactionReceiptResponse setBody(DescribeAntChainTransactionReceiptResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionReceiptResponseBody getBody() {
        return this.body;
    }

}
