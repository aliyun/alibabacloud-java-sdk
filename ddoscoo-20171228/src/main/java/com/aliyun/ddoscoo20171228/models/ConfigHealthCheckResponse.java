// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigHealthCheckResponseBody body;

    public static ConfigHealthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigHealthCheckResponse self = new ConfigHealthCheckResponse();
        return TeaModel.build(map, self);
    }

    public ConfigHealthCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigHealthCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigHealthCheckResponse setBody(ConfigHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigHealthCheckResponseBody getBody() {
        return this.body;
    }

}
