// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateRotationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRotationPolicyResponseBody body;

    public static UpdateRotationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRotationPolicyResponse self = new UpdateRotationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRotationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRotationPolicyResponse setBody(UpdateRotationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRotationPolicyResponseBody getBody() {
        return this.body;
    }

}
