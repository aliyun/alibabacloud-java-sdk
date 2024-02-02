// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecurityGroupPolicyResponseBody body;

    public static ModifySecurityGroupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupPolicyResponse self = new ModifySecurityGroupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityGroupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityGroupPolicyResponse setBody(ModifySecurityGroupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupPolicyResponseBody getBody() {
        return this.body;
    }

}
