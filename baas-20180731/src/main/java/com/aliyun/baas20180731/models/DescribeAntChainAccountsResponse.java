// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAntChainAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainAccountsResponse setBody(DescribeAntChainAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainAccountsResponseBody getBody() {
        return this.body;
    }

}
