// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7UsKeepaliveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigL7UsKeepaliveResponseBody body;

    public static ConfigL7UsKeepaliveResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7UsKeepaliveResponse self = new ConfigL7UsKeepaliveResponse();
        return TeaModel.build(map, self);
    }

    public ConfigL7UsKeepaliveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigL7UsKeepaliveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigL7UsKeepaliveResponse setBody(ConfigL7UsKeepaliveResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigL7UsKeepaliveResponseBody getBody() {
        return this.body;
    }

}
