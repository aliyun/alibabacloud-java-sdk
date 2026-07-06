// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetAccessKeyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccessKeyPolicyResponseBody body;

    public static SetAccessKeyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessKeyPolicyResponse self = new SetAccessKeyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessKeyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessKeyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccessKeyPolicyResponse setBody(SetAccessKeyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessKeyPolicyResponseBody getBody() {
        return this.body;
    }

}
