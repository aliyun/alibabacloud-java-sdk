// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateRegionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryMigrateRegionListResponse setBody(QueryMigrateRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMigrateRegionListResponseBody getBody() {
        return this.body;
    }

}
