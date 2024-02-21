// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateLogstashSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLogstashSettingsResponse setBody(UpdateLogstashSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogstashSettingsResponseBody getBody() {
        return this.body;
    }

}
