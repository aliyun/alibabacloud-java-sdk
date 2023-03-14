// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7RuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigLayer7RuleResponseBody body;

    public static ConfigLayer7RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7RuleResponse self = new ConfigLayer7RuleResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7RuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer7RuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer7RuleResponse setBody(ConfigLayer7RuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer7RuleResponseBody getBody() {
        return this.body;
    }

}
