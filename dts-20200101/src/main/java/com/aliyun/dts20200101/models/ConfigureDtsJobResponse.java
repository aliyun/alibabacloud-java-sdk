// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ConfigureDtsJobResponse setBody(ConfigureDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureDtsJobResponseBody getBody() {
        return this.body;
    }

}
