// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMpsSchedulerListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMpsSchedulerListResponseBody body;

    public static QueryMpsSchedulerListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMpsSchedulerListResponse self = new QueryMpsSchedulerListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMpsSchedulerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMpsSchedulerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMpsSchedulerListResponse setBody(QueryMpsSchedulerListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMpsSchedulerListResponseBody getBody() {
        return this.body;
    }

}
