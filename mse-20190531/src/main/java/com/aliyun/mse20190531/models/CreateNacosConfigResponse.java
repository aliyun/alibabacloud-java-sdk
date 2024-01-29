// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNacosConfigResponseBody body;

    public static CreateNacosConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosConfigResponse self = new CreateNacosConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateNacosConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNacosConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNacosConfigResponse setBody(CreateNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNacosConfigResponseBody getBody() {
        return this.body;
    }

}
