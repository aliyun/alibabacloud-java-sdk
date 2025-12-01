// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateIncrementBackupSetDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIncrementBackupSetDownloadResponseBody body;

    public static CreateIncrementBackupSetDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIncrementBackupSetDownloadResponse self = new CreateIncrementBackupSetDownloadResponse();
        return TeaModel.build(map, self);
    }

    public CreateIncrementBackupSetDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIncrementBackupSetDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIncrementBackupSetDownloadResponse setBody(CreateIncrementBackupSetDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIncrementBackupSetDownloadResponseBody getBody() {
        return this.body;
    }

}
