// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigNetworkRulesResponseBody body;

    public static ConfigNetworkRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRulesResponse self = new ConfigNetworkRulesResponse();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigNetworkRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigNetworkRulesResponse setBody(ConfigNetworkRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigNetworkRulesResponseBody getBody() {
        return this.body;
    }

}
