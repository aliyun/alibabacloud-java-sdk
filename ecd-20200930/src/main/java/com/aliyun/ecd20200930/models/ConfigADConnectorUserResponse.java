// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigADConnectorUserResponseBody body;

    public static ConfigADConnectorUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigADConnectorUserResponse self = new ConfigADConnectorUserResponse();
        return TeaModel.build(map, self);
    }

    public ConfigADConnectorUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigADConnectorUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigADConnectorUserResponse setBody(ConfigADConnectorUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigADConnectorUserResponseBody getBody() {
        return this.body;
    }

}
