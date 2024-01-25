// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeTransactionsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransactionsListResponseBody body;

    public static DescribeTransactionsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionsListResponse self = new DescribeTransactionsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransactionsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransactionsListResponse setBody(DescribeTransactionsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransactionsListResponseBody getBody() {
        return this.body;
    }

}
