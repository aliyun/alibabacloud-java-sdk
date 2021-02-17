// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAuditPolicyResponseBody body;

    public static ModifyAuditPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditPolicyResponse self = new ModifyAuditPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAuditPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAuditPolicyResponse setBody(ModifyAuditPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAuditPolicyResponseBody getBody() {
        return this.body;
    }

}
