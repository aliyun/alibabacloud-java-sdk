// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureSynchronizationJobAlertResponseBody body;

    public static ConfigureSynchronizationJobAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobAlertResponse self = new ConfigureSynchronizationJobAlertResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSynchronizationJobAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureSynchronizationJobAlertResponse setBody(ConfigureSynchronizationJobAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSynchronizationJobAlertResponseBody getBody() {
        return this.body;
    }

}
