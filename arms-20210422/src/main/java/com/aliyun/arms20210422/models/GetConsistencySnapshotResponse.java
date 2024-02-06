// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetConsistencySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsistencySnapshotResponseBody body;

    public static GetConsistencySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsistencySnapshotResponse self = new GetConsistencySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetConsistencySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsistencySnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsistencySnapshotResponse setBody(GetConsistencySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsistencySnapshotResponseBody getBody() {
        return this.body;
    }

}
