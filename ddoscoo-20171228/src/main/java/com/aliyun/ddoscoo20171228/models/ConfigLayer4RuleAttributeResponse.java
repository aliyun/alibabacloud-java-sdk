// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigLayer4RuleAttributeResponseBody body;

    public static ConfigLayer4RuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleAttributeResponse self = new ConfigLayer4RuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer4RuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer4RuleAttributeResponse setBody(ConfigLayer4RuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer4RuleAttributeResponseBody getBody() {
        return this.body;
    }

}
