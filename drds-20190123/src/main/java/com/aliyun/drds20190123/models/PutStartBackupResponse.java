// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PutStartBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutStartBackupResponseBody body;

    public static PutStartBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        PutStartBackupResponse self = new PutStartBackupResponse();
        return TeaModel.build(map, self);
    }

    public PutStartBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutStartBackupResponse setBody(PutStartBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public PutStartBackupResponseBody getBody() {
        return this.body;
    }

}
