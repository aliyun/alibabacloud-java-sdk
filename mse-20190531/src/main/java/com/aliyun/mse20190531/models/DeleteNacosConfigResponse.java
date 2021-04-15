// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNacosConfigResponseBody body;

    public static DeleteNacosConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosConfigResponse self = new DeleteNacosConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNacosConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNacosConfigResponse setBody(DeleteNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNacosConfigResponseBody getBody() {
        return this.body;
    }

}
