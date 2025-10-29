// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigSetListResponseBody body;

    public static ConfigSetListResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetListResponse self = new ConfigSetListResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigSetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigSetListResponse setBody(ConfigSetListResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigSetListResponseBody getBody() {
        return this.body;
    }

}
