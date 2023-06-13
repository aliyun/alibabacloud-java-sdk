// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateAuthPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAuthPolicyResponseBody body;

    public static UpdateAuthPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthPolicyResponse self = new UpdateAuthPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthPolicyResponse setBody(UpdateAuthPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthPolicyResponseBody getBody() {
        return this.body;
    }

}
