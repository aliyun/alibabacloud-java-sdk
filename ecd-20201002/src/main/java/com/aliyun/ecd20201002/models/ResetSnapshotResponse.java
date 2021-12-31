// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ResetSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetSnapshotResponseBody body;

    public static ResetSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSnapshotResponse self = new ResetSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ResetSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSnapshotResponse setBody(ResetSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSnapshotResponseBody getBody() {
        return this.body;
    }

}
