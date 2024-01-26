// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyAutoSnapshotPolicyResponseBody body;

    public static ApplyAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAutoSnapshotPolicyResponse self = new ApplyAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAutoSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyAutoSnapshotPolicyResponse setBody(ApplyAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
