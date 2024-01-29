// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNacosServiceResponseBody body;

    public static UpdateNacosServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosServiceResponse self = new UpdateNacosServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNacosServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNacosServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNacosServiceResponse setBody(UpdateNacosServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacosServiceResponseBody getBody() {
        return this.body;
    }

}
