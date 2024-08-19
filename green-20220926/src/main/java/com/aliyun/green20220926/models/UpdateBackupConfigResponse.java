// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateBackupConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBackupConfigResponseBody body;

    public static UpdateBackupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupConfigResponse self = new UpdateBackupConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBackupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBackupConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBackupConfigResponse setBody(UpdateBackupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBackupConfigResponseBody getBody() {
        return this.body;
    }

}
