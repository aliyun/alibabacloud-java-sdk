// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIcebergSnapshotsResponseBody body;

    public static ListIcebergSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergSnapshotsResponse self = new ListIcebergSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public ListIcebergSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIcebergSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIcebergSnapshotsResponse setBody(ListIcebergSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIcebergSnapshotsResponseBody getBody() {
        return this.body;
    }

}
