// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ResetBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetBackupResponseBody body;

    public static ResetBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetBackupResponse self = new ResetBackupResponse();
        return TeaModel.build(map, self);
    }

    public ResetBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetBackupResponse setBody(ResetBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetBackupResponseBody getBody() {
        return this.body;
    }

}
