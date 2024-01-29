// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNacosInstanceResponseBody body;

    public static UpdateNacosInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosInstanceResponse self = new UpdateNacosInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNacosInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNacosInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNacosInstanceResponse setBody(UpdateNacosInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacosInstanceResponseBody getBody() {
        return this.body;
    }

}
