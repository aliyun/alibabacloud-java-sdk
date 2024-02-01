// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStreamSnapshotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStreamSnapshotJobResponseBody body;

    public static QueryStreamSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamSnapshotJobResponse self = new QueryStreamSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryStreamSnapshotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStreamSnapshotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStreamSnapshotJobResponse setBody(QueryStreamSnapshotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStreamSnapshotJobResponseBody getBody() {
        return this.body;
    }

}
