// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListAutoSnapshotPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAutoSnapshotPoliciesResponseBody body;

    public static ListAutoSnapshotPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoSnapshotPoliciesResponse self = new ListAutoSnapshotPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoSnapshotPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoSnapshotPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoSnapshotPoliciesResponse setBody(ListAutoSnapshotPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoSnapshotPoliciesResponseBody getBody() {
        return this.body;
    }

}
