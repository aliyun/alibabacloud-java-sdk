// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteNacosConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNacosConfigResponse setBody(DeleteNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNacosConfigResponseBody getBody() {
        return this.body;
    }

}
