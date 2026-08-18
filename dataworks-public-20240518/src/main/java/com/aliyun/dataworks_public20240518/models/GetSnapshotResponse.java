// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSnapshotResponseBody body;

    public static GetSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotResponse self = new GetSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSnapshotResponse setBody(GetSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSnapshotResponseBody getBody() {
        return this.body;
    }

}
