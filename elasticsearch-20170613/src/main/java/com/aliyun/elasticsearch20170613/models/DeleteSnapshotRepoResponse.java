// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSnapshotRepoResponseBody body;

    public static DeleteSnapshotRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRepoResponse self = new DeleteSnapshotRepoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSnapshotRepoResponse setBody(DeleteSnapshotRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnapshotRepoResponseBody getBody() {
        return this.body;
    }

}
