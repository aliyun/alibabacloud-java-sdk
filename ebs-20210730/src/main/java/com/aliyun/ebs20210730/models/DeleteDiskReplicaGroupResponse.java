// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DeleteDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDiskReplicaGroupResponseBody body;

    public static DeleteDiskReplicaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskReplicaGroupResponse self = new DeleteDiskReplicaGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiskReplicaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDiskReplicaGroupResponse setBody(DeleteDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
