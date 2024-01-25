// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetResourceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceSnapshotResponseBody body;

    public static GetResourceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceSnapshotResponse self = new GetResourceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceSnapshotResponse setBody(GetResourceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceSnapshotResponseBody getBody() {
        return this.body;
    }

}
