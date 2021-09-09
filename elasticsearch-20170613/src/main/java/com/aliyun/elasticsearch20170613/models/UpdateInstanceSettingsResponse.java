// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateInstanceSettingsResponse setBody(UpdateInstanceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceSettingsResponseBody getBody() {
        return this.body;
    }

}
