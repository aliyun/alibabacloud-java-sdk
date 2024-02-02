// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ReprotectDiskReplicaGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReprotectDiskReplicaGroupResponseBody body;

    public static ReprotectDiskReplicaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ReprotectDiskReplicaGroupResponse self = new ReprotectDiskReplicaGroupResponse();
        return TeaModel.build(map, self);
    }

    public ReprotectDiskReplicaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReprotectDiskReplicaGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReprotectDiskReplicaGroupResponse setBody(ReprotectDiskReplicaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ReprotectDiskReplicaGroupResponseBody getBody() {
        return this.body;
    }

}
