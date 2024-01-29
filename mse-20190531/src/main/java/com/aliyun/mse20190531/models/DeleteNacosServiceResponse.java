// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteNacosServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNacosServiceResponse setBody(DeleteNacosServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNacosServiceResponseBody getBody() {
        return this.body;
    }

}
