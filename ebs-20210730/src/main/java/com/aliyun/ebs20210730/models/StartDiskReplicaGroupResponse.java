// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDiskReplicaGroupResponseBody body;

    public static StartDiskReplicaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDiskReplicaGroupResponse self = new StartDiskReplicaGroupResponse();
        return TeaModel.build(map, self);
    }

    public StartDiskReplicaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDiskReplicaGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDiskReplicaGroupResponse setBody(StartDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
