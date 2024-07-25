// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreatePluginConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePluginConfigResponseBody body;

    public static CreatePluginConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginConfigResponse self = new CreatePluginConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreatePluginConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePluginConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePluginConfigResponse setBody(CreatePluginConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePluginConfigResponseBody getBody() {
        return this.body;
    }

}
