// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyExResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAutoSnapshotPolicyExResponseBody body;

    public static ModifyAutoSnapshotPolicyExResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyExResponse self = new ModifyAutoSnapshotPolicyExResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyExResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoSnapshotPolicyExResponse setBody(ModifyAutoSnapshotPolicyExResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoSnapshotPolicyExResponseBody getBody() {
        return this.body;
    }

}
