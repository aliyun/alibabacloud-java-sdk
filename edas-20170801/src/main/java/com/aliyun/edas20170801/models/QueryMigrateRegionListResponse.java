// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateRegionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMigrateRegionListResponseBody body;

    public static QueryMigrateRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMigrateRegionListResponse self = new QueryMigrateRegionListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMigrateRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMigrateRegionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMigrateRegionListResponse setBody(QueryMigrateRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMigrateRegionListResponseBody getBody() {
        return this.body;
    }

}
