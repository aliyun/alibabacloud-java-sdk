// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveSnapshotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLiveSnapshotJobResponseBody body;

    public static GetLiveSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveSnapshotJobResponse self = new GetLiveSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveSnapshotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveSnapshotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveSnapshotJobResponse setBody(GetLiveSnapshotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveSnapshotJobResponseBody getBody() {
        return this.body;
    }

}
