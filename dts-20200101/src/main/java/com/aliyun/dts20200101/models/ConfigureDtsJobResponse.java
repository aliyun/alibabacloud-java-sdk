// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureDtsJobResponseBody body;

    public static ConfigureDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureDtsJobResponse self = new ConfigureDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureDtsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureDtsJobResponse setBody(ConfigureDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureDtsJobResponseBody getBody() {
        return this.body;
    }

}
