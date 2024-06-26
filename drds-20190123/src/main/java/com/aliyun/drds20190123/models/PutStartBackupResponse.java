// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PutStartBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public PutStartBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutStartBackupResponse setBody(PutStartBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public PutStartBackupResponseBody getBody() {
        return this.body;
    }

}
