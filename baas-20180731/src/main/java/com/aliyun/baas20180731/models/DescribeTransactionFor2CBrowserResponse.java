// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionFor2CBrowserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransactionFor2CBrowserResponseBody body;

    public static DescribeTransactionFor2CBrowserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionFor2CBrowserResponse self = new DescribeTransactionFor2CBrowserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionFor2CBrowserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransactionFor2CBrowserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransactionFor2CBrowserResponse setBody(DescribeTransactionFor2CBrowserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransactionFor2CBrowserResponseBody getBody() {
        return this.body;
    }

}
