// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class QuerySyncStatusByAliUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySyncStatusByAliUidResponseBody body;

    public static QuerySyncStatusByAliUidResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncStatusByAliUidResponse self = new QuerySyncStatusByAliUidResponse();
        return TeaModel.build(map, self);
    }

    public QuerySyncStatusByAliUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySyncStatusByAliUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySyncStatusByAliUidResponse setBody(QuerySyncStatusByAliUidResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySyncStatusByAliUidResponseBody getBody() {
        return this.body;
    }

}
