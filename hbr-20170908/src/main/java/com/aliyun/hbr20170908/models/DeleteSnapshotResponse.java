// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
