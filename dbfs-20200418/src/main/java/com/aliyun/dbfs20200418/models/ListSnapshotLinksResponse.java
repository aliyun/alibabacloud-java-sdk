// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListSnapshotLinksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSnapshotLinksResponseBody body;

    public static ListSnapshotLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotLinksResponse self = new ListSnapshotLinksResponse();
        return TeaModel.build(map, self);
    }

    public ListSnapshotLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSnapshotLinksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSnapshotLinksResponse setBody(ListSnapshotLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotLinksResponseBody getBody() {
        return this.body;
    }

}
