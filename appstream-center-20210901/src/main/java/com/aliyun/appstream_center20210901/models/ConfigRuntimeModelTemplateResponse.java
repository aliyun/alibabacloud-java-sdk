// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ConfigRuntimeModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigRuntimeModelTemplateResponseBody body;

    public static ConfigRuntimeModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigRuntimeModelTemplateResponse self = new ConfigRuntimeModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ConfigRuntimeModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigRuntimeModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigRuntimeModelTemplateResponse setBody(ConfigRuntimeModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigRuntimeModelTemplateResponseBody getBody() {
        return this.body;
    }

}
