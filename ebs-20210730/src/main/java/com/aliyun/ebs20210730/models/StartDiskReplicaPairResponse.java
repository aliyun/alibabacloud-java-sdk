// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDiskReplicaPairResponseBody body;

    public static StartDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDiskReplicaPairResponse self = new StartDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public StartDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDiskReplicaPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDiskReplicaPairResponse setBody(StartDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
