// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigLayer7CertResponseBody body;

    public static ConfigLayer7CertResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CertResponse self = new ConfigLayer7CertResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer7CertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer7CertResponse setBody(ConfigLayer7CertResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer7CertResponseBody getBody() {
        return this.body;
    }

}
