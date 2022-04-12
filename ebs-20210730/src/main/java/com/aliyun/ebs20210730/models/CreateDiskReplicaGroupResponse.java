// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDiskReplicaGroupResponseBody body;

    public static CreateDiskReplicaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaGroupResponse self = new CreateDiskReplicaGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiskReplicaGroupResponse setBody(CreateDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
