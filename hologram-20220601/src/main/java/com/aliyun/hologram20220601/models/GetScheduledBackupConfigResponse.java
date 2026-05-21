// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetScheduledBackupConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledBackupConfigResponseBody body;

    public static GetScheduledBackupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledBackupConfigResponse self = new GetScheduledBackupConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledBackupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledBackupConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledBackupConfigResponse setBody(GetScheduledBackupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledBackupConfigResponseBody getBody() {
        return this.body;
    }

}
