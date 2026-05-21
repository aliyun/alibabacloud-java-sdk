// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateBackupDataDescResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBackupDataDescResponseBody body;

    public static UpdateBackupDataDescResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupDataDescResponse self = new UpdateBackupDataDescResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBackupDataDescResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBackupDataDescResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBackupDataDescResponse setBody(UpdateBackupDataDescResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBackupDataDescResponseBody getBody() {
        return this.body;
    }

}
