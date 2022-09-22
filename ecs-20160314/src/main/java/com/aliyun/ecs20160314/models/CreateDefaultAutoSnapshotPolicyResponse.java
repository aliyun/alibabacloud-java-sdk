// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDefaultAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDefaultAutoSnapshotPolicyResponseBody body;

    public static CreateDefaultAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultAutoSnapshotPolicyResponse self = new CreateDefaultAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefaultAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefaultAutoSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDefaultAutoSnapshotPolicyResponse setBody(CreateDefaultAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefaultAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
