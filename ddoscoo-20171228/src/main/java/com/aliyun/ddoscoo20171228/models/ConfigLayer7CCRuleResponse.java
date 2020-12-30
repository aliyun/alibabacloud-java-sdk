// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CCRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigLayer7CCRuleResponseBody body;

    public static ConfigLayer7CCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CCRuleResponse self = new ConfigLayer7CCRuleResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer7CCRuleResponse setBody(ConfigLayer7CCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer7CCRuleResponseBody getBody() {
        return this.body;
    }

}
