// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateClientSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClientSettingsResponseBody body;

    public static UpdateClientSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientSettingsResponse self = new UpdateClientSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClientSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClientSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClientSettingsResponse setBody(UpdateClientSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClientSettingsResponseBody getBody() {
        return this.body;
    }

}
