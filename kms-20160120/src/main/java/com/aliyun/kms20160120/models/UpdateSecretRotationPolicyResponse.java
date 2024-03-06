// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretRotationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateSecretRotationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecretRotationPolicyResponse setBody(UpdateSecretRotationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecretRotationPolicyResponseBody getBody() {
        return this.body;
    }

}
