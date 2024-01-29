// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSnapshotUrlsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSnapshotUrlsResponseBody body;

    public static GetSnapshotUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotUrlsResponse self = new GetSnapshotUrlsResponse();
        return TeaModel.build(map, self);
    }

    public GetSnapshotUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSnapshotUrlsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSnapshotUrlsResponse setBody(GetSnapshotUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSnapshotUrlsResponseBody getBody() {
        return this.body;
    }

}
