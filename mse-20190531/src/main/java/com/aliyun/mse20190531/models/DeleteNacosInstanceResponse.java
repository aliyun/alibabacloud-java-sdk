// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNacosInstanceResponseBody body;

    public static DeleteNacosInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosInstanceResponse self = new DeleteNacosInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNacosInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNacosInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNacosInstanceResponse setBody(DeleteNacosInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNacosInstanceResponseBody getBody() {
        return this.body;
    }

}
