// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLiveWatchUserListResponseBody body;

    public static QueryLiveWatchUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchUserListResponse self = new QueryLiveWatchUserListResponse();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLiveWatchUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLiveWatchUserListResponse setBody(QueryLiveWatchUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLiveWatchUserListResponseBody getBody() {
        return this.body;
    }

}
