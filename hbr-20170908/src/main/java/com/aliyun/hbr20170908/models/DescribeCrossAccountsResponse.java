// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeCrossAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCrossAccountsResponseBody body;

    public static DescribeCrossAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossAccountsResponse self = new DescribeCrossAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCrossAccountsResponse setBody(DescribeCrossAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossAccountsResponseBody getBody() {
        return this.body;
    }

}
