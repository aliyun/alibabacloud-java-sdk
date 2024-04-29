// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyTlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTlsConfigResponseBody body;

    public static ModifyTlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTlsConfigResponse self = new ModifyTlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTlsConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTlsConfigResponse setBody(ModifyTlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTlsConfigResponseBody getBody() {
        return this.body;
    }

}
