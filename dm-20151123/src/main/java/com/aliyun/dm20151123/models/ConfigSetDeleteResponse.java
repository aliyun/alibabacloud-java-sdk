// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigSetDeleteResponseBody body;

    public static ConfigSetDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetDeleteResponse self = new ConfigSetDeleteResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSetDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigSetDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigSetDeleteResponse setBody(ConfigSetDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigSetDeleteResponseBody getBody() {
        return this.body;
    }

}
