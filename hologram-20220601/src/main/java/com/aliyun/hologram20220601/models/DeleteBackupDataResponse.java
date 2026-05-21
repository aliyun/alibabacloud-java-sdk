// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteBackupDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBackupDataResponseBody body;

    public static DeleteBackupDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupDataResponse self = new DeleteBackupDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupDataResponse setBody(DeleteBackupDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupDataResponseBody getBody() {
        return this.body;
    }

}
