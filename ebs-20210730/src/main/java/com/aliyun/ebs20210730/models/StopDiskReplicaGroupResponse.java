// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StopDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StopDiskReplicaGroupResponse setBody(StopDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
