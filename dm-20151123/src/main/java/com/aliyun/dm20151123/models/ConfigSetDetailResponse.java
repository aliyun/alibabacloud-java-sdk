// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigSetDetailResponseBody body;

    public static ConfigSetDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetDetailResponse self = new ConfigSetDetailResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSetDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigSetDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigSetDetailResponse setBody(ConfigSetDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigSetDetailResponseBody getBody() {
        return this.body;
    }

}
