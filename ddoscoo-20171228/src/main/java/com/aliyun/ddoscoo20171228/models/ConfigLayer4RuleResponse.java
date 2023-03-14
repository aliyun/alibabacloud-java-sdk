// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigLayer4RuleResponseBody body;

    public static ConfigLayer4RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleResponse self = new ConfigLayer4RuleResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer4RuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer4RuleResponse setBody(ConfigLayer4RuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer4RuleResponseBody getBody() {
        return this.body;
    }

}
