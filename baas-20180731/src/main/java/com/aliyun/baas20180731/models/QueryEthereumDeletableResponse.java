// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryEthereumDeletableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEthereumDeletableResponseBody body;

    public static QueryEthereumDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEthereumDeletableResponse self = new QueryEthereumDeletableResponse();
        return TeaModel.build(map, self);
    }

    public QueryEthereumDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEthereumDeletableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEthereumDeletableResponse setBody(QueryEthereumDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEthereumDeletableResponseBody getBody() {
        return this.body;
    }

}
