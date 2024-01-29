// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveSnapshotFilesResponseBody body;

    public static DeleteLiveSnapshotFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotFilesResponse self = new DeleteLiveSnapshotFilesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveSnapshotFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveSnapshotFilesResponse setBody(DeleteLiveSnapshotFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveSnapshotFilesResponseBody getBody() {
        return this.body;
    }

}
