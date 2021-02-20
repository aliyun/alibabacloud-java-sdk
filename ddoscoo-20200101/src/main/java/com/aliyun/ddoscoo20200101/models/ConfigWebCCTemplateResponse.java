// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ConfigWebCCTemplateResponse setBody(ConfigWebCCTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigWebCCTemplateResponseBody getBody() {
        return this.body;
    }

}
