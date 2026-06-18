// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RestoreSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreSnapshotResponseBody body;

    public static RestoreSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreSnapshotResponse self = new RestoreSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public RestoreSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreSnapshotResponse setBody(RestoreSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreSnapshotResponseBody getBody() {
        return this.body;
    }

}
