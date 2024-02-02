// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutoSnapshotPolicyResponseBody body;

    public static DeleteAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoSnapshotPolicyResponse self = new DeleteAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoSnapshotPolicyResponse setBody(DeleteAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
