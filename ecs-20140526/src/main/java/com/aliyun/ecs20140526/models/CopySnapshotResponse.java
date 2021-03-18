// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopySnapshotResponseBody body;

    public static CopySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CopySnapshotResponse self = new CopySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CopySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopySnapshotResponse setBody(CopySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CopySnapshotResponseBody getBody() {
        return this.body;
    }

}
