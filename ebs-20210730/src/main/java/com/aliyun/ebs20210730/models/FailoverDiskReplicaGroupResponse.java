// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class FailoverDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public FailoverDiskReplicaGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FailoverDiskReplicaGroupResponse setBody(FailoverDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public FailoverDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
