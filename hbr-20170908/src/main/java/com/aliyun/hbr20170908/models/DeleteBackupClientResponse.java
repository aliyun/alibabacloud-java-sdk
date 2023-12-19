// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupClientResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackupClientResponseBody body;

    public static DeleteBackupClientResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupClientResponse self = new DeleteBackupClientResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupClientResponse setBody(DeleteBackupClientResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupClientResponseBody getBody() {
        return this.body;
    }

}
