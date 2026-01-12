// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BackupAppResponseBody body;

    public static BackupAppResponse build(java.util.Map<String, ?> map) throws Exception {
        BackupAppResponse self = new BackupAppResponse();
        return TeaModel.build(map, self);
    }

    public BackupAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BackupAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BackupAppResponse setBody(BackupAppResponseBody body) {
        this.body = body;
        return this;
    }
    public BackupAppResponseBody getBody() {
        return this.body;
    }

}
