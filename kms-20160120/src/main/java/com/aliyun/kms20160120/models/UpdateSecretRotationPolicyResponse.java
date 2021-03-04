// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretRotationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSecretRotationPolicyResponseBody body;

    public static UpdateSecretRotationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretRotationPolicyResponse self = new UpdateSecretRotationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecretRotationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecretRotationPolicyResponse setBody(UpdateSecretRotationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecretRotationPolicyResponseBody getBody() {
        return this.body;
    }

}
