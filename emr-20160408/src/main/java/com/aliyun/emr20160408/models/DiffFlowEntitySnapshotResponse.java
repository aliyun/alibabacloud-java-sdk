// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DiffFlowEntitySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DiffFlowEntitySnapshotResponseBody body;

    public static DiffFlowEntitySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DiffFlowEntitySnapshotResponse self = new DiffFlowEntitySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DiffFlowEntitySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiffFlowEntitySnapshotResponse setBody(DiffFlowEntitySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public DiffFlowEntitySnapshotResponseBody getBody() {
        return this.body;
    }

}
