// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigSetCreateResponseBody body;

    public static ConfigSetCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetCreateResponse self = new ConfigSetCreateResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSetCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigSetCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigSetCreateResponse setBody(ConfigSetCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigSetCreateResponseBody getBody() {
        return this.body;
    }

}
