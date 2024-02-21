// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAlternativeSnapshotReposResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlternativeSnapshotReposResponseBody body;

    public static ListAlternativeSnapshotReposResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlternativeSnapshotReposResponse self = new ListAlternativeSnapshotReposResponse();
        return TeaModel.build(map, self);
    }

    public ListAlternativeSnapshotReposResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlternativeSnapshotReposResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlternativeSnapshotReposResponse setBody(ListAlternativeSnapshotReposResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlternativeSnapshotReposResponseBody getBody() {
        return this.body;
    }

}
