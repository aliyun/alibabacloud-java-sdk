// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RestoreFlowEntitySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreFlowEntitySnapshotResponseBody body;

    public static RestoreFlowEntitySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreFlowEntitySnapshotResponse self = new RestoreFlowEntitySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public RestoreFlowEntitySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreFlowEntitySnapshotResponse setBody(RestoreFlowEntitySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreFlowEntitySnapshotResponseBody getBody() {
        return this.body;
    }

}
