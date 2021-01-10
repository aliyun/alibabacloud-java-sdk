// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ConfigAIActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigAIActionResponseBody body;

    public static ConfigAIActionResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigAIActionResponse self = new ConfigAIActionResponse();
        return TeaModel.build(map, self);
    }

    public ConfigAIActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigAIActionResponse setBody(ConfigAIActionResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigAIActionResponseBody getBody() {
        return this.body;
    }

}
