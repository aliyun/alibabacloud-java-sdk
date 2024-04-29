// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigUdpReflectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigUdpReflectResponseBody body;

    public static ConfigUdpReflectResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigUdpReflectResponse self = new ConfigUdpReflectResponse();
        return TeaModel.build(map, self);
    }

    public ConfigUdpReflectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigUdpReflectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigUdpReflectResponse setBody(ConfigUdpReflectResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigUdpReflectResponseBody getBody() {
        return this.body;
    }

}
