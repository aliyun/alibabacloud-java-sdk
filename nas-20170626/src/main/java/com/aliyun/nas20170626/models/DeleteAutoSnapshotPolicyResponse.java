// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
