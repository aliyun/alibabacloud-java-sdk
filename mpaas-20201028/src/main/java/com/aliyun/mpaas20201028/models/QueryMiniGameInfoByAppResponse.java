// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMiniGameInfoByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMiniGameInfoByAppResponseBody body;

    public static QueryMiniGameInfoByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniGameInfoByAppResponse self = new QueryMiniGameInfoByAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryMiniGameInfoByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMiniGameInfoByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMiniGameInfoByAppResponse setBody(QueryMiniGameInfoByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMiniGameInfoByAppResponseBody getBody() {
        return this.body;
    }

}
