// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigLayer4RemarkResponseBody body;

    public static ConfigLayer4RemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RemarkResponse self = new ConfigLayer4RemarkResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer4RemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer4RemarkResponse setBody(ConfigLayer4RemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer4RemarkResponseBody getBody() {
        return this.body;
    }

}
