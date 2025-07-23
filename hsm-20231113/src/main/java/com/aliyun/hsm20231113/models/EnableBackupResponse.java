// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class EnableBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableBackupResponseBody body;

    public static EnableBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBackupResponse self = new EnableBackupResponse();
        return TeaModel.build(map, self);
    }

    public EnableBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableBackupResponse setBody(EnableBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableBackupResponseBody getBody() {
        return this.body;
    }

}
