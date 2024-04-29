// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7RsPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigL7RsPolicyResponseBody body;

    public static ConfigL7RsPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7RsPolicyResponse self = new ConfigL7RsPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ConfigL7RsPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigL7RsPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigL7RsPolicyResponse setBody(ConfigL7RsPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigL7RsPolicyResponseBody getBody() {
        return this.body;
    }

}
