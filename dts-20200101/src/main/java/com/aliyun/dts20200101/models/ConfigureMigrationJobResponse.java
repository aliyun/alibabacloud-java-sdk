// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureMigrationJobResponseBody body;

    public static ConfigureMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureMigrationJobResponse self = new ConfigureMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureMigrationJobResponse setBody(ConfigureMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureMigrationJobResponseBody getBody() {
        return this.body;
    }

}
