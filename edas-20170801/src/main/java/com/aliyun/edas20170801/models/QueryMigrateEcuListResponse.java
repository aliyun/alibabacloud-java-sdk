// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateEcuListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMigrateEcuListResponseBody body;

    public static QueryMigrateEcuListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMigrateEcuListResponse self = new QueryMigrateEcuListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMigrateEcuListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMigrateEcuListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMigrateEcuListResponse setBody(QueryMigrateEcuListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMigrateEcuListResponseBody getBody() {
        return this.body;
    }

}
