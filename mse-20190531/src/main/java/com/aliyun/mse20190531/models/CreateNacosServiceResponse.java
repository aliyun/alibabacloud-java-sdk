// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNacosServiceResponseBody body;

    public static CreateNacosServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosServiceResponse self = new CreateNacosServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNacosServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNacosServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNacosServiceResponse setBody(CreateNacosServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNacosServiceResponseBody getBody() {
        return this.body;
    }

}
