// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyExResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyAutoSnapshotPolicyExResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoSnapshotPolicyExResponse setBody(ModifyAutoSnapshotPolicyExResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoSnapshotPolicyExResponseBody getBody() {
        return this.body;
    }

}
