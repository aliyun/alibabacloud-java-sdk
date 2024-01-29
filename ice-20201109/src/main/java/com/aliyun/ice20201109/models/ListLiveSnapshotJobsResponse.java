// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveSnapshotJobsResponseBody body;

    public static ListLiveSnapshotJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotJobsResponse self = new ListLiveSnapshotJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveSnapshotJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveSnapshotJobsResponse setBody(ListLiveSnapshotJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveSnapshotJobsResponseBody getBody() {
        return this.body;
    }

}
