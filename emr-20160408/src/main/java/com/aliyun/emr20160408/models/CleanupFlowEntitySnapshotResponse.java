// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CleanupFlowEntitySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CleanupFlowEntitySnapshotResponseBody body;

    public static CleanupFlowEntitySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CleanupFlowEntitySnapshotResponse self = new CleanupFlowEntitySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CleanupFlowEntitySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CleanupFlowEntitySnapshotResponse setBody(CleanupFlowEntitySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CleanupFlowEntitySnapshotResponseBody getBody() {
        return this.body;
    }

}
