// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNacosInstanceResponseBody body;

    public static CreateNacosInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosInstanceResponse self = new CreateNacosInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNacosInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNacosInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNacosInstanceResponse setBody(CreateNacosInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNacosInstanceResponseBody getBody() {
        return this.body;
    }

}
