// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryAuctionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAuctionsResponseBody body;

    public static QueryAuctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuctionsResponse self = new QueryAuctionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuctionsResponse setBody(QueryAuctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuctionsResponseBody getBody() {
        return this.body;
    }

}
