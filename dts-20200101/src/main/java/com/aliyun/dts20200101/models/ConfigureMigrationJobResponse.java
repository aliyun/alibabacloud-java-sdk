// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ConfigureMigrationJobResponse setBody(ConfigureMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureMigrationJobResponseBody getBody() {
        return this.body;
    }

}
