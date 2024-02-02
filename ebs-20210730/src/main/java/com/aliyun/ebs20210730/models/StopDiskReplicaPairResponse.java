// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StopDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDiskReplicaPairResponseBody body;

    public static StopDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDiskReplicaPairResponse self = new StopDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public StopDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDiskReplicaPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDiskReplicaPairResponse setBody(StopDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
