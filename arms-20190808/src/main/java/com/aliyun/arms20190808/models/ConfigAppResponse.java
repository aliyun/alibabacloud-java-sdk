// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ConfigAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigAppResponseBody body;

    public static ConfigAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigAppResponse self = new ConfigAppResponse();
        return TeaModel.build(map, self);
    }

    public ConfigAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigAppResponse setBody(ConfigAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigAppResponseBody getBody() {
        return this.body;
    }

}
