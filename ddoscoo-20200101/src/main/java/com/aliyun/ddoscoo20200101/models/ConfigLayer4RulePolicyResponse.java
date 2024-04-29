// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RulePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigLayer4RulePolicyResponseBody body;

    public static ConfigLayer4RulePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RulePolicyResponse self = new ConfigLayer4RulePolicyResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RulePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer4RulePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer4RulePolicyResponse setBody(ConfigLayer4RulePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer4RulePolicyResponseBody getBody() {
        return this.body;
    }

}
