// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionReceiptFor2CBrowserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransactionReceiptFor2CBrowserResponseBody body;

    public static DescribeTransactionReceiptFor2CBrowserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionReceiptFor2CBrowserResponse self = new DescribeTransactionReceiptFor2CBrowserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionReceiptFor2CBrowserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransactionReceiptFor2CBrowserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransactionReceiptFor2CBrowserResponse setBody(DescribeTransactionReceiptFor2CBrowserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransactionReceiptFor2CBrowserResponseBody getBody() {
        return this.body;
    }

}
