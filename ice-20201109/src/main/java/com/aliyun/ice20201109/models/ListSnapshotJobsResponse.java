// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSnapshotJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSnapshotJobsResponseBody body;

    public static ListSnapshotJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotJobsResponse self = new ListSnapshotJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSnapshotJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSnapshotJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSnapshotJobsResponse setBody(ListSnapshotJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotJobsResponseBody getBody() {
        return this.body;
    }

}
