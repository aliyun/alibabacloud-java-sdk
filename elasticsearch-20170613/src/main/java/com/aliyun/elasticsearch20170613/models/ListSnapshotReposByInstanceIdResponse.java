// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSnapshotReposByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSnapshotReposByInstanceIdResponse setBody(ListSnapshotReposByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotReposByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
