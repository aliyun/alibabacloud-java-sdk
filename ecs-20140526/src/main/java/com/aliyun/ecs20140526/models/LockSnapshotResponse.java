// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class LockSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LockSnapshotResponseBody body;

    public static LockSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        LockSnapshotResponse self = new LockSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public LockSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockSnapshotResponse setBody(LockSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public LockSnapshotResponseBody getBody() {
        return this.body;
    }

}
