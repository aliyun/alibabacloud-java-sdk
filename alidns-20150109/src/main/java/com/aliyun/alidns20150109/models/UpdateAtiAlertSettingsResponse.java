// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateAtiAlertSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAtiAlertSettingsResponseBody body;

    public static UpdateAtiAlertSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAtiAlertSettingsResponse self = new UpdateAtiAlertSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAtiAlertSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAtiAlertSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAtiAlertSettingsResponse setBody(UpdateAtiAlertSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAtiAlertSettingsResponseBody getBody() {
        return this.body;
    }

}
