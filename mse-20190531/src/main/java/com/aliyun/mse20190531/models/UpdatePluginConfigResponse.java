// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdatePluginConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePluginConfigResponseBody body;

    public static UpdatePluginConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePluginConfigResponse self = new UpdatePluginConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePluginConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePluginConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePluginConfigResponse setBody(UpdatePluginConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePluginConfigResponseBody getBody() {
        return this.body;
    }

}
