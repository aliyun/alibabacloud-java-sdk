// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class FailoverDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FailoverDiskReplicaGroupResponseBody body;

    public static FailoverDiskReplicaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        FailoverDiskReplicaGroupResponse self = new FailoverDiskReplicaGroupResponse();
        return TeaModel.build(map, self);
    }

    public FailoverDiskReplicaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailoverDiskReplicaGroupResponse setBody(FailoverDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public FailoverDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
