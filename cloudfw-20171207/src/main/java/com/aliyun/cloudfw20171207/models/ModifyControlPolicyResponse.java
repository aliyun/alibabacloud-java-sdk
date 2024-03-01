// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyControlPolicyResponseBody body;

    public static ModifyControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyResponse self = new ModifyControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyControlPolicyResponse setBody(ModifyControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyControlPolicyResponseBody getBody() {
        return this.body;
    }

}
