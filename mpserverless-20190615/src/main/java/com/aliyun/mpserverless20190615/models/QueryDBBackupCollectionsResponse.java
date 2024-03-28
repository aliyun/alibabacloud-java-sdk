// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDBBackupCollectionsResponseBody body;

    public static QueryDBBackupCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDBBackupCollectionsResponse self = new QueryDBBackupCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDBBackupCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDBBackupCollectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDBBackupCollectionsResponse setBody(QueryDBBackupCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBBackupCollectionsResponseBody getBody() {
        return this.body;
    }

}
