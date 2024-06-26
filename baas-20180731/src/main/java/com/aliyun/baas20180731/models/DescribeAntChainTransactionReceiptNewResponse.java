// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainTransactionReceiptNewResponseBody body;

    public static DescribeAntChainTransactionReceiptNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptNewResponse self = new DescribeAntChainTransactionReceiptNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionReceiptNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainTransactionReceiptNewResponse setBody(DescribeAntChainTransactionReceiptNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionReceiptNewResponseBody getBody() {
        return this.body;
    }

}
