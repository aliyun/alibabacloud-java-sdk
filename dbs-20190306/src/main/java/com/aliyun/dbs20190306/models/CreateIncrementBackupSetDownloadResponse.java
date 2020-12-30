// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateIncrementBackupSetDownloadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateIncrementBackupSetDownloadResponse setBody(CreateIncrementBackupSetDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIncrementBackupSetDownloadResponseBody getBody() {
        return this.body;
    }

}
