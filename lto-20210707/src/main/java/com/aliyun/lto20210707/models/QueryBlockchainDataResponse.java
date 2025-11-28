// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class QueryBlockchainDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBlockchainDataResponseBody body;

    public static QueryBlockchainDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainDataResponse self = new QueryBlockchainDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBlockchainDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBlockchainDataResponse setBody(QueryBlockchainDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBlockchainDataResponseBody getBody() {
        return this.body;
    }

}
