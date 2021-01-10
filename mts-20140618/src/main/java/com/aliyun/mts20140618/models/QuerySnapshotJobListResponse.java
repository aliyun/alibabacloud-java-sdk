// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySnapshotJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySnapshotJobListResponseBody body;

    public static QuerySnapshotJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySnapshotJobListResponse self = new QuerySnapshotJobListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySnapshotJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySnapshotJobListResponse setBody(QuerySnapshotJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySnapshotJobListResponseBody getBody() {
        return this.body;
    }

}
