// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class ConfigurationSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigurationSynchronizationJobResponseBody body;

    public static ConfigurationSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationSynchronizationJobResponse self = new ConfigurationSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public ConfigurationSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigurationSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigurationSynchronizationJobResponse setBody(ConfigurationSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigurationSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
