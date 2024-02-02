// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateDiskReplicaGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiskReplicaGroupResponse setBody(CreateDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
