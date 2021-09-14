// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSnapshotResponseBody body;

    public static ListSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotResponse self = new ListSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ListSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSnapshotResponse setBody(ListSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotResponseBody getBody() {
        return this.body;
    }

}
