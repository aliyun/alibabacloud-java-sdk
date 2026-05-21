// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateManualBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateManualBackupResponseBody body;

    public static CreateManualBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateManualBackupResponse self = new CreateManualBackupResponse();
        return TeaModel.build(map, self);
    }

    public CreateManualBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateManualBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateManualBackupResponse setBody(CreateManualBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateManualBackupResponseBody getBody() {
        return this.body;
    }

}
