// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHealthCheckConfigResponseBody body;

    public static ModifyHealthCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckConfigResponse self = new ModifyHealthCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHealthCheckConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHealthCheckConfigResponse setBody(ModifyHealthCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHealthCheckConfigResponseBody getBody() {
        return this.body;
    }

}
