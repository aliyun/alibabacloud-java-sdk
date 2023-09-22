// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3TransactionLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWeb3TransactionLabelsResponseBody body;

    public static DescribeWeb3TransactionLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3TransactionLabelsResponse self = new DescribeWeb3TransactionLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3TransactionLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWeb3TransactionLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWeb3TransactionLabelsResponse setBody(DescribeWeb3TransactionLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWeb3TransactionLabelsResponseBody getBody() {
        return this.body;
    }

}
