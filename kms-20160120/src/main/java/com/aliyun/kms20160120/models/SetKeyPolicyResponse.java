// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetKeyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetKeyPolicyResponseBody body;

    public static SetKeyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetKeyPolicyResponse self = new SetKeyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetKeyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetKeyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetKeyPolicyResponse setBody(SetKeyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetKeyPolicyResponseBody getBody() {
        return this.body;
    }

}
