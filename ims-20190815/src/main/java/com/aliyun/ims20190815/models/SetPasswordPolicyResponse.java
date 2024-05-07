// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPasswordPolicyResponseBody body;

    public static SetPasswordPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyResponse self = new SetPasswordPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetPasswordPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPasswordPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPasswordPolicyResponse setBody(SetPasswordPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPasswordPolicyResponseBody getBody() {
        return this.body;
    }

}
