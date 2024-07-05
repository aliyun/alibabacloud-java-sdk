// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySnapshotJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QuerySnapshotJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySnapshotJobListResponse setBody(QuerySnapshotJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySnapshotJobListResponseBody getBody() {
        return this.body;
    }

}
