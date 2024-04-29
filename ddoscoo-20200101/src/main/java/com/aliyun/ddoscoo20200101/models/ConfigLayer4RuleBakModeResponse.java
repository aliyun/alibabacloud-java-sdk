// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleBakModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigLayer4RuleBakModeResponseBody body;

    public static ConfigLayer4RuleBakModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleBakModeResponse self = new ConfigLayer4RuleBakModeResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleBakModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer4RuleBakModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer4RuleBakModeResponse setBody(ConfigLayer4RuleBakModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer4RuleBakModeResponseBody getBody() {
        return this.body;
    }

}
