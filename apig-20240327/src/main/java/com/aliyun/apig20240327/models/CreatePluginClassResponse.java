// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePluginClassResponseBody body;

    public static CreatePluginClassResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginClassResponse self = new CreatePluginClassResponse();
        return TeaModel.build(map, self);
    }

    public CreatePluginClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePluginClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePluginClassResponse setBody(CreatePluginClassResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePluginClassResponseBody getBody() {
        return this.body;
    }

}
