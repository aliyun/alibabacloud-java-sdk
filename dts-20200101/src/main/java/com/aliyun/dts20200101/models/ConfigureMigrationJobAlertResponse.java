// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureMigrationJobAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureMigrationJobAlertResponseBody body;

    public static ConfigureMigrationJobAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureMigrationJobAlertResponse self = new ConfigureMigrationJobAlertResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureMigrationJobAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureMigrationJobAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureMigrationJobAlertResponse setBody(ConfigureMigrationJobAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureMigrationJobAlertResponseBody getBody() {
        return this.body;
    }

}
