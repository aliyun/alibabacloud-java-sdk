// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartReplicaGroupDrillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartReplicaGroupDrillResponseBody body;

    public static StartReplicaGroupDrillResponse build(java.util.Map<String, ?> map) throws Exception {
        StartReplicaGroupDrillResponse self = new StartReplicaGroupDrillResponse();
        return TeaModel.build(map, self);
    }

    public StartReplicaGroupDrillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartReplicaGroupDrillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartReplicaGroupDrillResponse setBody(StartReplicaGroupDrillResponseBody body) {
        this.body = body;
        return this;
    }
    public StartReplicaGroupDrillResponseBody getBody() {
        return this.body;
    }

}
