// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableHiveAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableHiveAccessResponseBody body;

    public static DisableHiveAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableHiveAccessResponse self = new DisableHiveAccessResponse();
        return TeaModel.build(map, self);
    }

    public DisableHiveAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableHiveAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableHiveAccessResponse setBody(DisableHiveAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableHiveAccessResponseBody getBody() {
        return this.body;
    }

}
