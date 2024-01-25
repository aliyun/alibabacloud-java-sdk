// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryServerLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryServerLockResponseBody body;

    public static QueryServerLockResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServerLockResponse self = new QueryServerLockResponse();
        return TeaModel.build(map, self);
    }

    public QueryServerLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryServerLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryServerLockResponse setBody(QueryServerLockResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServerLockResponseBody getBody() {
        return this.body;
    }

}
