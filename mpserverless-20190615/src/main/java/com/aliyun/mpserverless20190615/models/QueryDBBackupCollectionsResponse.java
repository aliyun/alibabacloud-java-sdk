// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryDBBackupCollectionsResponse setBody(QueryDBBackupCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBBackupCollectionsResponseBody getBody() {
        return this.body;
    }

}
