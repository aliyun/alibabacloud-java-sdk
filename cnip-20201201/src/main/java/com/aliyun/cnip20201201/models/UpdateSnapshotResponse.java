// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSnapshotResponseBody body;

    public static UpdateSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotResponse self = new UpdateSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSnapshotResponse setBody(UpdateSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSnapshotResponseBody getBody() {
        return this.body;
    }

}
