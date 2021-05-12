// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateSnapshotInstanceJoinOptionWithBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSnapshotInstanceJoinOptionWithBatchResponseBody body;

    public static UpdateSnapshotInstanceJoinOptionWithBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotInstanceJoinOptionWithBatchResponse self = new UpdateSnapshotInstanceJoinOptionWithBatchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchResponse setBody(UpdateSnapshotInstanceJoinOptionWithBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSnapshotInstanceJoinOptionWithBatchResponseBody getBody() {
        return this.body;
    }

}
