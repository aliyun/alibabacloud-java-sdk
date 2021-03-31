// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ModifyAutoSnapshotPolicyResponse setBody(ModifyAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
