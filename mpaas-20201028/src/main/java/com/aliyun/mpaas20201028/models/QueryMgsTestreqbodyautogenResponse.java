// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsTestreqbodyautogenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMgsTestreqbodyautogenResponseBody body;

    public static QueryMgsTestreqbodyautogenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsTestreqbodyautogenResponse self = new QueryMgsTestreqbodyautogenResponse();
        return TeaModel.build(map, self);
    }

    public QueryMgsTestreqbodyautogenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMgsTestreqbodyautogenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMgsTestreqbodyautogenResponse setBody(QueryMgsTestreqbodyautogenResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMgsTestreqbodyautogenResponseBody getBody() {
        return this.body;
    }

}
