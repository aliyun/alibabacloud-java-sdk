// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigureSubscriptionInstanceResponseBody body;

    public static ConfigureSubscriptionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionInstanceResponse self = new ConfigureSubscriptionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSubscriptionInstanceResponse setBody(ConfigureSubscriptionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSubscriptionInstanceResponseBody getBody() {
        return this.body;
    }

}
