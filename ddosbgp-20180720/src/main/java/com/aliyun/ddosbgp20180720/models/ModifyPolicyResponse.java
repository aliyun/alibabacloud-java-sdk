// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolicyResponseBody body;

    public static ModifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyResponse self = new ModifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolicyResponse setBody(ModifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolicyResponseBody getBody() {
        return this.body;
    }

}
