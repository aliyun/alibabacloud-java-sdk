// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDcdnWafPolicyResponseBody body;

    public static ModifyDcdnWafPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyResponse self = new ModifyDcdnWafPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDcdnWafPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDcdnWafPolicyResponse setBody(ModifyDcdnWafPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDcdnWafPolicyResponseBody getBody() {
        return this.body;
    }

}
