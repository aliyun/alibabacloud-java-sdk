// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLogstashSettingsResponseBody body;

    public static UpdateLogstashSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashSettingsResponse self = new UpdateLogstashSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLogstashSettingsResponse setBody(UpdateLogstashSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogstashSettingsResponseBody getBody() {
        return this.body;
    }

}
