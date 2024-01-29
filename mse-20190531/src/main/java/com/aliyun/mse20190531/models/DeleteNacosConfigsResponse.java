// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNacosConfigsResponseBody body;

    public static DeleteNacosConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosConfigsResponse self = new DeleteNacosConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNacosConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNacosConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNacosConfigsResponse setBody(DeleteNacosConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNacosConfigsResponseBody getBody() {
        return this.body;
    }

}
