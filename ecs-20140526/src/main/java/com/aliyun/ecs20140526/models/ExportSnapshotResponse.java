// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportSnapshotResponseBody body;

    public static ExportSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportSnapshotResponse self = new ExportSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ExportSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportSnapshotResponse setBody(ExportSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportSnapshotResponseBody getBody() {
        return this.body;
    }

}
