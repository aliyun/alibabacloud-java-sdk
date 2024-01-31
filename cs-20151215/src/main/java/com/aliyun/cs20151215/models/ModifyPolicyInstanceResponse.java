// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyPolicyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolicyInstanceResponseBody body;

    public static ModifyPolicyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyInstanceResponse self = new ModifyPolicyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolicyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolicyInstanceResponse setBody(ModifyPolicyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolicyInstanceResponseBody getBody() {
        return this.body;
    }

}
