// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteStreamSnapshotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStreamSnapshotJobResponseBody body;

    public static DeleteStreamSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamSnapshotJobResponse self = new DeleteStreamSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStreamSnapshotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStreamSnapshotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStreamSnapshotJobResponse setBody(DeleteStreamSnapshotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStreamSnapshotJobResponseBody getBody() {
        return this.body;
    }

}
