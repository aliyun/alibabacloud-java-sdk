// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ConfigAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ConfigAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigAppResponse setBody(ConfigAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigAppResponseBody getBody() {
        return this.body;
    }

}
