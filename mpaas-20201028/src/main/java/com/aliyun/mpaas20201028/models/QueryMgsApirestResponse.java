// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsApirestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMgsApirestResponseBody body;

    public static QueryMgsApirestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApirestResponse self = new QueryMgsApirestResponse();
        return TeaModel.build(map, self);
    }

    public QueryMgsApirestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMgsApirestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMgsApirestResponse setBody(QueryMgsApirestResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMgsApirestResponseBody getBody() {
        return this.body;
    }

}
