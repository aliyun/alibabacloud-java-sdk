// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestTransactionDigestsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainLatestTransactionDigestsNewResponseBody body;

    public static DescribeAntChainLatestTransactionDigestsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestTransactionDigestsNewResponse self = new DescribeAntChainLatestTransactionDigestsNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestTransactionDigestsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainLatestTransactionDigestsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainLatestTransactionDigestsNewResponse setBody(DescribeAntChainLatestTransactionDigestsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainLatestTransactionDigestsNewResponseBody getBody() {
        return this.body;
    }

}
