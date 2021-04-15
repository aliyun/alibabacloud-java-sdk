// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateNacosConfigResponse setBody(CreateNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNacosConfigResponseBody getBody() {
        return this.body;
    }

}
