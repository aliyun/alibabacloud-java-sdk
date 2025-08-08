// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetTableSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TableSnapshot body;

    public static GetTableSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableSnapshotResponse self = new GetTableSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetTableSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableSnapshotResponse setBody(TableSnapshot body) {
        this.body = body;
        return this;
    }
    public TableSnapshot getBody() {
        return this.body;
    }

}
