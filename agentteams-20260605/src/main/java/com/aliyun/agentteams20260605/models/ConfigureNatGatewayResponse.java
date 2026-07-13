// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ConfigureNatGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureNatGatewayResponseBody body;

    public static ConfigureNatGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureNatGatewayResponse self = new ConfigureNatGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureNatGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureNatGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureNatGatewayResponse setBody(ConfigureNatGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureNatGatewayResponseBody getBody() {
        return this.body;
    }

}
