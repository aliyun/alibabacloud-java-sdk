// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListSnapshotRepositoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSnapshotRepositoriesResponseBody body;

    public static ListSnapshotRepositoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotRepositoriesResponse self = new ListSnapshotRepositoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListSnapshotRepositoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSnapshotRepositoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSnapshotRepositoriesResponse setBody(ListSnapshotRepositoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotRepositoriesResponseBody getBody() {
        return this.body;
    }

}
