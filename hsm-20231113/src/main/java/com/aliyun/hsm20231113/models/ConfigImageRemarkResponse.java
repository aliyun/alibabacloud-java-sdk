// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigImageRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigImageRemarkResponseBody body;

    public static ConfigImageRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigImageRemarkResponse self = new ConfigImageRemarkResponse();
        return TeaModel.build(map, self);
    }

    public ConfigImageRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigImageRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigImageRemarkResponse setBody(ConfigImageRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigImageRemarkResponseBody getBody() {
        return this.body;
    }

}
