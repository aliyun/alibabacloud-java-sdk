// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigClusterWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigClusterWhitelistResponseBody body;

    public static ConfigClusterWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigClusterWhitelistResponse self = new ConfigClusterWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ConfigClusterWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigClusterWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigClusterWhitelistResponse setBody(ConfigClusterWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigClusterWhitelistResponseBody getBody() {
        return this.body;
    }

}
