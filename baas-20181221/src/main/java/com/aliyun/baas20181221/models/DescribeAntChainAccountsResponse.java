// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainAccountsResponseBody body;

    public static DescribeAntChainAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainAccountsResponse self = new DescribeAntChainAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainAccountsResponse setBody(DescribeAntChainAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainAccountsResponseBody getBody() {
        return this.body;
    }

}
