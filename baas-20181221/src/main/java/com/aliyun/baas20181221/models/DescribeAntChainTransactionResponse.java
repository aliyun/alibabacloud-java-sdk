// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainTransactionResponseBody body;

    public static DescribeAntChainTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionResponse self = new DescribeAntChainTransactionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionResponse setBody(DescribeAntChainTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionResponseBody getBody() {
        return this.body;
    }

}
