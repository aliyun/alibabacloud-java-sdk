// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNacosConfigResponseBody body;

    public static UpdateNacosConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosConfigResponse self = new UpdateNacosConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNacosConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNacosConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNacosConfigResponse setBody(UpdateNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacosConfigResponseBody getBody() {
        return this.body;
    }

}
