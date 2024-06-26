// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatestTransactionDigestsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLatestTransactionDigestsResponseBody body;

    public static DescribeLatestTransactionDigestsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestTransactionDigestsResponse self = new DescribeLatestTransactionDigestsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLatestTransactionDigestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLatestTransactionDigestsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLatestTransactionDigestsResponse setBody(DescribeLatestTransactionDigestsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLatestTransactionDigestsResponseBody getBody() {
        return this.body;
    }

}
