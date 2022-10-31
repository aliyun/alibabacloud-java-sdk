// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteSnapshotFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSnapshotFilesResponseBody body;

    public static DeleteSnapshotFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotFilesResponse self = new DeleteSnapshotFilesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSnapshotFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSnapshotFilesResponse setBody(DeleteSnapshotFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnapshotFilesResponseBody getBody() {
        return this.body;
    }

}
