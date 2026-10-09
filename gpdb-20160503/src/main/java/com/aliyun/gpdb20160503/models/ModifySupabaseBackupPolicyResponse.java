// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySupabaseBackupPolicyResponseBody body;

    public static ModifySupabaseBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseBackupPolicyResponse self = new ModifySupabaseBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySupabaseBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySupabaseBackupPolicyResponse setBody(ModifySupabaseBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySupabaseBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
