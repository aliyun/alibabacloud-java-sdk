// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListAutoSnapshotPolicyAppliedDbfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoSnapshotPolicyAppliedDbfsResponseBody body;

    public static ListAutoSnapshotPolicyAppliedDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoSnapshotPolicyAppliedDbfsResponse self = new ListAutoSnapshotPolicyAppliedDbfsResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponse setBody(ListAutoSnapshotPolicyAppliedDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoSnapshotPolicyAppliedDbfsResponseBody getBody() {
        return this.body;
    }

}
