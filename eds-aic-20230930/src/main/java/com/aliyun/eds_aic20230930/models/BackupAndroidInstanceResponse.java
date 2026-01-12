// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupAndroidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BackupAndroidInstanceResponseBody body;

    public static BackupAndroidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BackupAndroidInstanceResponse self = new BackupAndroidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BackupAndroidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BackupAndroidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BackupAndroidInstanceResponse setBody(BackupAndroidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BackupAndroidInstanceResponseBody getBody() {
        return this.body;
    }

}
