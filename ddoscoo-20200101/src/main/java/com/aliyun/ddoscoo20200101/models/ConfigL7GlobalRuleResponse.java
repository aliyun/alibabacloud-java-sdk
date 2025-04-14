// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7GlobalRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigL7GlobalRuleResponseBody body;

    public static ConfigL7GlobalRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7GlobalRuleResponse self = new ConfigL7GlobalRuleResponse();
        return TeaModel.build(map, self);
    }

    public ConfigL7GlobalRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigL7GlobalRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigL7GlobalRuleResponse setBody(ConfigL7GlobalRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigL7GlobalRuleResponseBody getBody() {
        return this.body;
    }

}
