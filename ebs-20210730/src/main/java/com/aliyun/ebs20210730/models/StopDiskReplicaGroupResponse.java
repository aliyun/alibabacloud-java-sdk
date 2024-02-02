// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StopDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDiskReplicaGroupResponseBody body;

    public static StopDiskReplicaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDiskReplicaGroupResponse self = new StopDiskReplicaGroupResponse();
        return TeaModel.build(map, self);
    }

    public StopDiskReplicaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDiskReplicaGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDiskReplicaGroupResponse setBody(StopDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
