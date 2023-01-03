// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListAutoSnapshotPolicyUnappliedDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAutoSnapshotPolicyUnappliedDbfsResponseBody body;

    public static ListAutoSnapshotPolicyUnappliedDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoSnapshotPolicyUnappliedDbfsResponse self = new ListAutoSnapshotPolicyUnappliedDbfsResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponse setBody(ListAutoSnapshotPolicyUnappliedDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoSnapshotPolicyUnappliedDbfsResponseBody getBody() {
        return this.body;
    }

}
