// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateScheduledBackupConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScheduledBackupConfigResponseBody body;

    public static UpdateScheduledBackupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledBackupConfigResponse self = new UpdateScheduledBackupConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledBackupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduledBackupConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScheduledBackupConfigResponse setBody(UpdateScheduledBackupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduledBackupConfigResponseBody getBody() {
        return this.body;
    }

}
