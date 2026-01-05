// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnlockSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnlockSnapshotResponseBody body;

    public static UnlockSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockSnapshotResponse self = new UnlockSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public UnlockSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockSnapshotResponse setBody(UnlockSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockSnapshotResponseBody getBody() {
        return this.body;
    }

}
