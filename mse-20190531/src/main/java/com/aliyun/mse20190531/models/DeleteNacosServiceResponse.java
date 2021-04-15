// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNacosServiceResponseBody body;

    public static DeleteNacosServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosServiceResponse self = new DeleteNacosServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNacosServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNacosServiceResponse setBody(DeleteNacosServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNacosServiceResponseBody getBody() {
        return this.body;
    }

}
