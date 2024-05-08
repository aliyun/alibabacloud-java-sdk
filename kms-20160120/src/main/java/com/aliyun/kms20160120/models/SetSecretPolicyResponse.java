// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetSecretPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSecretPolicyResponseBody body;

    public static SetSecretPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSecretPolicyResponse self = new SetSecretPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetSecretPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSecretPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSecretPolicyResponse setBody(SetSecretPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSecretPolicyResponseBody getBody() {
        return this.body;
    }

}
