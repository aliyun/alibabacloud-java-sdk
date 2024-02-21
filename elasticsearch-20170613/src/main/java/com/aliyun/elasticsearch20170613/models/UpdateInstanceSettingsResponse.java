// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceSettingsResponseBody body;

    public static UpdateInstanceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSettingsResponse self = new UpdateInstanceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceSettingsResponse setBody(UpdateInstanceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceSettingsResponseBody getBody() {
        return this.body;
    }

}
