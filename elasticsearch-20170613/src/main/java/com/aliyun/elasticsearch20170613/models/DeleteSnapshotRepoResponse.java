// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRepoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteSnapshotRepoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSnapshotRepoResponse setBody(DeleteSnapshotRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnapshotRepoResponseBody getBody() {
        return this.body;
    }

}
