// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSnapshotResponseBody body;

    public static DeleteSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotResponse self = new DeleteSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSnapshotResponse setBody(DeleteSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnapshotResponseBody getBody() {
        return this.body;
    }

}
