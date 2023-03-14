// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CCTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigLayer7CCTemplateResponseBody body;

    public static ConfigLayer7CCTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CCTemplateResponse self = new ConfigLayer7CCTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CCTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer7CCTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer7CCTemplateResponse setBody(ConfigLayer7CCTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer7CCTemplateResponseBody getBody() {
        return this.body;
    }

}
