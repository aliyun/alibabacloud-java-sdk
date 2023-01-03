// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutoSnapshotPolicyResponseBody body;

    public static GetAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoSnapshotPolicyResponse self = new GetAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoSnapshotPolicyResponse setBody(GetAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
