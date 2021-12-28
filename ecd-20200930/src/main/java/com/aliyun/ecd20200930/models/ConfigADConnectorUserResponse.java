// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigADConnectorUserResponseBody body;

    public static ConfigADConnectorUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigADConnectorUserResponse self = new ConfigADConnectorUserResponse();
        return TeaModel.build(map, self);
    }

    public ConfigADConnectorUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigADConnectorUserResponse setBody(ConfigADConnectorUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigADConnectorUserResponseBody getBody() {
        return this.body;
    }

}
