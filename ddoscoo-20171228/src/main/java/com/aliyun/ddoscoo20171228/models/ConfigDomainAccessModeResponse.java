// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigDomainAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigDomainAccessModeResponseBody body;

    public static ConfigDomainAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigDomainAccessModeResponse self = new ConfigDomainAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public ConfigDomainAccessModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigDomainAccessModeResponse setBody(ConfigDomainAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigDomainAccessModeResponseBody getBody() {
        return this.body;
    }

}
