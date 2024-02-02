// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySnapshotGroupResponseBody body;

    public static ModifySnapshotGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotGroupResponse self = new ModifySnapshotGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySnapshotGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySnapshotGroupResponse setBody(ModifySnapshotGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySnapshotGroupResponseBody getBody() {
        return this.body;
    }

}
