// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSnapshotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSnapshotJobResponseBody body;

    public static GetSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotJobResponse self = new GetSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public GetSnapshotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSnapshotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSnapshotJobResponse setBody(GetSnapshotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSnapshotJobResponseBody getBody() {
        return this.body;
    }

}
