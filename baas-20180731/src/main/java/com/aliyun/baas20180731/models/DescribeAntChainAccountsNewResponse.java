// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainAccountsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainAccountsNewResponseBody body;

    public static DescribeAntChainAccountsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainAccountsNewResponse self = new DescribeAntChainAccountsNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainAccountsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainAccountsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainAccountsNewResponse setBody(DescribeAntChainAccountsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainAccountsNewResponseBody getBody() {
        return this.body;
    }

}
