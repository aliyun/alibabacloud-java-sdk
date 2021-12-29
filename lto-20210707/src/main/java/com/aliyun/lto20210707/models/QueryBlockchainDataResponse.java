// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class QueryBlockchainDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryBlockchainDataResponse setBody(QueryBlockchainDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBlockchainDataResponseBody getBody() {
        return this.body;
    }

}
