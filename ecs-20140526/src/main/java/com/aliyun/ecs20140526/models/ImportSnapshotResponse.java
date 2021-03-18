// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportSnapshotResponseBody body;

    public static ImportSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportSnapshotResponse self = new ImportSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ImportSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportSnapshotResponse setBody(ImportSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportSnapshotResponseBody getBody() {
        return this.body;
    }

}
