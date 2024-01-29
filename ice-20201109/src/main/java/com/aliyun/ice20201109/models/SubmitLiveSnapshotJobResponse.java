// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveSnapshotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitLiveSnapshotJobResponseBody body;

    public static SubmitLiveSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveSnapshotJobResponse self = new SubmitLiveSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitLiveSnapshotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitLiveSnapshotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitLiveSnapshotJobResponse setBody(SubmitLiveSnapshotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitLiveSnapshotJobResponseBody getBody() {
        return this.body;
    }

}
