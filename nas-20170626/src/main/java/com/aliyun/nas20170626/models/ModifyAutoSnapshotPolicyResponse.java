// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAutoSnapshotPolicyResponseBody body;

    public static ModifyAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyResponse self = new ModifyAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoSnapshotPolicyResponse setBody(ModifyAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
