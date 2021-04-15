// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateNacosConfigResponse setBody(UpdateNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacosConfigResponseBody getBody() {
        return this.body;
    }

}
