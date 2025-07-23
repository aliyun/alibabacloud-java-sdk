// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigInstanceRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigInstanceRemarkResponseBody body;

    public static ConfigInstanceRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceRemarkResponse self = new ConfigInstanceRemarkResponse();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigInstanceRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigInstanceRemarkResponse setBody(ConfigInstanceRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigInstanceRemarkResponseBody getBody() {
        return this.body;
    }

}
