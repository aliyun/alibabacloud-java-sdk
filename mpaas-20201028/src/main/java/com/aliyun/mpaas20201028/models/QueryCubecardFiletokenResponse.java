// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryCubecardFiletokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCubecardFiletokenResponseBody body;

    public static QueryCubecardFiletokenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCubecardFiletokenResponse self = new QueryCubecardFiletokenResponse();
        return TeaModel.build(map, self);
    }

    public QueryCubecardFiletokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCubecardFiletokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCubecardFiletokenResponse setBody(QueryCubecardFiletokenResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCubecardFiletokenResponseBody getBody() {
        return this.body;
    }

}
