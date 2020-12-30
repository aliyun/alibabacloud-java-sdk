// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateFullBackupSetDownloadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFullBackupSetDownloadResponseBody body;

    public static CreateFullBackupSetDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFullBackupSetDownloadResponse self = new CreateFullBackupSetDownloadResponse();
        return TeaModel.build(map, self);
    }

    public CreateFullBackupSetDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFullBackupSetDownloadResponse setBody(CreateFullBackupSetDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFullBackupSetDownloadResponseBody getBody() {
        return this.body;
    }

}
