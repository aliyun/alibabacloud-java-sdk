// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class ConfigNetStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigNetStatusResponseBody body;

    public static ConfigNetStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetStatusResponse self = new ConfigNetStatusResponse();
        return TeaModel.build(map, self);
    }

    public ConfigNetStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigNetStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigNetStatusResponse setBody(ConfigNetStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigNetStatusResponseBody getBody() {
        return this.body;
    }

}
