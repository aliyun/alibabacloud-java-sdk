// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateEcuListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryMigrateEcuListResponse setBody(QueryMigrateEcuListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMigrateEcuListResponseBody getBody() {
        return this.body;
    }

}
