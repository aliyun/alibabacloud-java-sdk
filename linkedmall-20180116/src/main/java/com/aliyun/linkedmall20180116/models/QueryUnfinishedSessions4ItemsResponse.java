// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessions4ItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnfinishedSessions4ItemsResponseBody body;

    public static QueryUnfinishedSessions4ItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessions4ItemsResponse self = new QueryUnfinishedSessions4ItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessions4ItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnfinishedSessions4ItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUnfinishedSessions4ItemsResponse setBody(QueryUnfinishedSessions4ItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnfinishedSessions4ItemsResponseBody getBody() {
        return this.body;
    }

}
