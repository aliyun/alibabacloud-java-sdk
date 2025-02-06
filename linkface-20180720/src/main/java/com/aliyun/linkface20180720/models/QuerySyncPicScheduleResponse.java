// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QuerySyncPicScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySyncPicScheduleResponseBody body;

    public static QuerySyncPicScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncPicScheduleResponse self = new QuerySyncPicScheduleResponse();
        return TeaModel.build(map, self);
    }

    public QuerySyncPicScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySyncPicScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySyncPicScheduleResponse setBody(QuerySyncPicScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySyncPicScheduleResponseBody getBody() {
        return this.body;
    }

}
