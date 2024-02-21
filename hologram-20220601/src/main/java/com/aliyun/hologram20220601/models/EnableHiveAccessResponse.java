// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class EnableHiveAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableHiveAccessResponseBody body;

    public static EnableHiveAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableHiveAccessResponse self = new EnableHiveAccessResponse();
        return TeaModel.build(map, self);
    }

    public EnableHiveAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableHiveAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableHiveAccessResponse setBody(EnableHiveAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHiveAccessResponseBody getBody() {
        return this.body;
    }

}
