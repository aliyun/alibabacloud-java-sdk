// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryPendingPushListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPendingPushListResponseBody body;

    public static QueryPendingPushListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPendingPushListResponse self = new QueryPendingPushListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPendingPushListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPendingPushListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPendingPushListResponse setBody(QueryPendingPushListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPendingPushListResponseBody getBody() {
        return this.body;
    }

}
