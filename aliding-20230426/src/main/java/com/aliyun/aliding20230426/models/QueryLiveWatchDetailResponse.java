// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLiveWatchDetailResponseBody body;

    public static QueryLiveWatchDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchDetailResponse self = new QueryLiveWatchDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLiveWatchDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLiveWatchDetailResponse setBody(QueryLiveWatchDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLiveWatchDetailResponseBody getBody() {
        return this.body;
    }

}
