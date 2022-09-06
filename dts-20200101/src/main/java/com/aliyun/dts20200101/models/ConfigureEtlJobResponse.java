// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureEtlJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigureEtlJobResponseBody body;

    public static ConfigureEtlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureEtlJobResponse self = new ConfigureEtlJobResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureEtlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureEtlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureEtlJobResponse setBody(ConfigureEtlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureEtlJobResponseBody getBody() {
        return this.body;
    }

}
