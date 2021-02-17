// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBackupPolicyResponseBody body;

    public static ModifyBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyResponse self = new ModifyBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupPolicyResponse setBody(ModifyBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
