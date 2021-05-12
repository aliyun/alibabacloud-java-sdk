// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateSnapshotInstanceJoinOptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSnapshotInstanceJoinOptionResponseBody body;

    public static UpdateSnapshotInstanceJoinOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotInstanceJoinOptionResponse self = new UpdateSnapshotInstanceJoinOptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotInstanceJoinOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSnapshotInstanceJoinOptionResponse setBody(UpdateSnapshotInstanceJoinOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSnapshotInstanceJoinOptionResponseBody getBody() {
        return this.body;
    }

}
