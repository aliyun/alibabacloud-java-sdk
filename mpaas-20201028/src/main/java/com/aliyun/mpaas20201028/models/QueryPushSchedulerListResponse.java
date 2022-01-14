// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPushSchedulerListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPushSchedulerListResponseBody body;

    public static QueryPushSchedulerListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushSchedulerListResponse self = new QueryPushSchedulerListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushSchedulerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushSchedulerListResponse setBody(QueryPushSchedulerListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushSchedulerListResponseBody getBody() {
        return this.body;
    }

}
