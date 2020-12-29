// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestTransactionDigestsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainLatestTransactionDigestsResponseBody body;

    public static DescribeAntChainLatestTransactionDigestsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestTransactionDigestsResponse self = new DescribeAntChainLatestTransactionDigestsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestTransactionDigestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainLatestTransactionDigestsResponse setBody(DescribeAntChainLatestTransactionDigestsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainLatestTransactionDigestsResponseBody getBody() {
        return this.body;
    }

}
