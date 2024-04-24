// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetBackupLocalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetBackupLocalResponseBody body;

    public static SetBackupLocalResponse build(java.util.Map<String, ?> map) throws Exception {
        SetBackupLocalResponse self = new SetBackupLocalResponse();
        return TeaModel.build(map, self);
    }

    public SetBackupLocalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetBackupLocalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetBackupLocalResponse setBody(SetBackupLocalResponseBody body) {
        this.body = body;
        return this;
    }
    public SetBackupLocalResponseBody getBody() {
        return this.body;
    }

}
