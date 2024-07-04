// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSnapshotJobResponseBody body;

    public static SubmitSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobResponse self = new SubmitSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSnapshotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSnapshotJobResponse setBody(SubmitSnapshotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSnapshotJobResponseBody getBody() {
        return this.body;
    }

}
