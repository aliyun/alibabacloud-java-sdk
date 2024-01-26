// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetSnapshotResponseBody body;

    public static ResetSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSnapshotResponse self = new ResetSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ResetSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetSnapshotResponse setBody(ResetSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSnapshotResponseBody getBody() {
        return this.body;
    }

}
