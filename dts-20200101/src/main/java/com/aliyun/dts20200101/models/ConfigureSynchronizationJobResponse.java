// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureSynchronizationJobResponseBody body;

    public static ConfigureSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobResponse self = new ConfigureSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureSynchronizationJobResponse setBody(ConfigureSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
