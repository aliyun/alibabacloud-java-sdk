// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigWebCCTemplateResponseBody body;

    public static ConfigWebCCTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebCCTemplateResponse self = new ConfigWebCCTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ConfigWebCCTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigWebCCTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigWebCCTemplateResponse setBody(ConfigWebCCTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigWebCCTemplateResponseBody getBody() {
        return this.body;
    }

}
