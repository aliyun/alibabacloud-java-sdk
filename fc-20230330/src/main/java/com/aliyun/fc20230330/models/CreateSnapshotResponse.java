// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Snapshot body;

    public static CreateSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotResponse self = new CreateSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSnapshotResponse setBody(Snapshot body) {
        this.body = body;
        return this;
    }
    public Snapshot getBody() {
        return this.body;
    }

}
