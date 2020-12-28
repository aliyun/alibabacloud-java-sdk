// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySnapshotAttributeResponseBody body;

    public static ModifySnapshotAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotAttributeResponse self = new ModifySnapshotAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySnapshotAttributeResponse setBody(ModifySnapshotAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySnapshotAttributeResponseBody getBody() {
        return this.body;
    }

}
