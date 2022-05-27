// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDiskReplicaGroupResponseBody body;

    public static ModifyDiskReplicaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskReplicaGroupResponse self = new ModifyDiskReplicaGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskReplicaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskReplicaGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskReplicaGroupResponse setBody(ModifyDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
