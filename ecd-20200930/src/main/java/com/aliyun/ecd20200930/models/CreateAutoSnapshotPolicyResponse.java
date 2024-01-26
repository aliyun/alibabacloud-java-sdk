// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutoSnapshotPolicyResponseBody body;

    public static CreateAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyResponse self = new CreateAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoSnapshotPolicyResponse setBody(CreateAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
