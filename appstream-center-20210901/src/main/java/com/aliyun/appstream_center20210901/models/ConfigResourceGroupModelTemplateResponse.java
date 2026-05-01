// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ConfigResourceGroupModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigResourceGroupModelTemplateResponseBody body;

    public static ConfigResourceGroupModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigResourceGroupModelTemplateResponse self = new ConfigResourceGroupModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ConfigResourceGroupModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigResourceGroupModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigResourceGroupModelTemplateResponse setBody(ConfigResourceGroupModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigResourceGroupModelTemplateResponseBody getBody() {
        return this.body;
    }

}
