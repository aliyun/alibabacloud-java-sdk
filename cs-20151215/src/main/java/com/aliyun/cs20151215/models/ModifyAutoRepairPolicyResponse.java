// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyAutoRepairPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAutoRepairPolicyResponseBody body;

    public static ModifyAutoRepairPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRepairPolicyResponse self = new ModifyAutoRepairPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRepairPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoRepairPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoRepairPolicyResponse setBody(ModifyAutoRepairPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoRepairPolicyResponseBody getBody() {
        return this.body;
    }

}
