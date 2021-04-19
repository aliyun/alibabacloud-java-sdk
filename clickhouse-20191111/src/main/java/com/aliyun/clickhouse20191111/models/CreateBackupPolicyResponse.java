// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBackupPolicyResponseBody body;

    public static CreateBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPolicyResponse self = new CreateBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackupPolicyResponse setBody(CreateBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
