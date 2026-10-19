// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAdvancedBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAdvancedBackupPolicyResponseBody body;

    public static ModifyAdvancedBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvancedBackupPolicyResponse self = new ModifyAdvancedBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAdvancedBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAdvancedBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAdvancedBackupPolicyResponse setBody(ModifyAdvancedBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAdvancedBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
