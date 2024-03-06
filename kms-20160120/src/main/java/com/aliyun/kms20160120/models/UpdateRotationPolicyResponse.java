// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateRotationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateRotationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRotationPolicyResponse setBody(UpdateRotationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRotationPolicyResponseBody getBody() {
        return this.body;
    }

}
