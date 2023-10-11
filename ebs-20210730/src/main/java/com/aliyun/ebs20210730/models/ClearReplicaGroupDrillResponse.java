// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ClearReplicaGroupDrillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ClearReplicaGroupDrillResponseBody body;

    public static ClearReplicaGroupDrillResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearReplicaGroupDrillResponse self = new ClearReplicaGroupDrillResponse();
        return TeaModel.build(map, self);
    }

    public ClearReplicaGroupDrillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearReplicaGroupDrillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearReplicaGroupDrillResponse setBody(ClearReplicaGroupDrillResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearReplicaGroupDrillResponseBody getBody() {
        return this.body;
    }

}
