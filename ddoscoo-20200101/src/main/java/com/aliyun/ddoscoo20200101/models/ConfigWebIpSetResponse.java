// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebIpSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigWebIpSetResponseBody body;

    public static ConfigWebIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebIpSetResponse self = new ConfigWebIpSetResponse();
        return TeaModel.build(map, self);
    }

    public ConfigWebIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigWebIpSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigWebIpSetResponse setBody(ConfigWebIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigWebIpSetResponseBody getBody() {
        return this.body;
    }

}
