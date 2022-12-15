// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelAutoSnapshotPolicyResponseBody body;

    public static CancelAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyResponse self = new CancelAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAutoSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAutoSnapshotPolicyResponse setBody(CancelAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
