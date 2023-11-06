// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetBackupPolicyResponseBody body;

    public static SetBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetBackupPolicyResponse self = new SetBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetBackupPolicyResponse setBody(SetBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
