// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RealLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigLayer4RealLimitResponseBody body;

    public static ConfigLayer4RealLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RealLimitResponse self = new ConfigLayer4RealLimitResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RealLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer4RealLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer4RealLimitResponse setBody(ConfigLayer4RealLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer4RealLimitResponseBody getBody() {
        return this.body;
    }

}
