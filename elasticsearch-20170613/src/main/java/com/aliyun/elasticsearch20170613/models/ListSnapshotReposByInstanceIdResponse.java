// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSnapshotReposByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSnapshotReposByInstanceIdResponseBody body;

    public static ListSnapshotReposByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotReposByInstanceIdResponse self = new ListSnapshotReposByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public ListSnapshotReposByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSnapshotReposByInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSnapshotReposByInstanceIdResponse setBody(ListSnapshotReposByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotReposByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
