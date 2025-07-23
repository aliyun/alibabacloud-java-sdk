// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigInstanceWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigInstanceWhitelistResponseBody body;

    public static ConfigInstanceWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceWhitelistResponse self = new ConfigInstanceWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigInstanceWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigInstanceWhitelistResponse setBody(ConfigInstanceWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigInstanceWhitelistResponseBody getBody() {
        return this.body;
    }

}
