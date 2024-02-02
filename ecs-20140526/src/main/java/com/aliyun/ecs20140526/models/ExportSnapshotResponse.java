// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ExportSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportSnapshotResponse setBody(ExportSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportSnapshotResponseBody getBody() {
        return this.body;
    }

}
