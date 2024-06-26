// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainTransactionNewResponseBody body;

    public static DescribeAntChainTransactionNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionNewResponse self = new DescribeAntChainTransactionNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainTransactionNewResponse setBody(DescribeAntChainTransactionNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionNewResponseBody getBody() {
        return this.body;
    }

}
