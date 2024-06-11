// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BackupFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BackupFileResponseBody body;

    public static BackupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        BackupFileResponse self = new BackupFileResponse();
        return TeaModel.build(map, self);
    }

    public BackupFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BackupFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BackupFileResponse setBody(BackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public BackupFileResponseBody getBody() {
        return this.body;
    }

}
