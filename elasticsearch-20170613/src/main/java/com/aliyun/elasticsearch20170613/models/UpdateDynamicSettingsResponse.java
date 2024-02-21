// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDynamicSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDynamicSettingsResponseBody body;

    public static UpdateDynamicSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDynamicSettingsResponse self = new UpdateDynamicSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDynamicSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDynamicSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDynamicSettingsResponse setBody(UpdateDynamicSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDynamicSettingsResponseBody getBody() {
        return this.body;
    }

}
