// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteSnapshotGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSnapshotGroupResponseBody body;

    public static DeleteSnapshotGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotGroupResponse self = new DeleteSnapshotGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSnapshotGroupResponse setBody(DeleteSnapshotGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnapshotGroupResponseBody getBody() {
        return this.body;
    }

}
