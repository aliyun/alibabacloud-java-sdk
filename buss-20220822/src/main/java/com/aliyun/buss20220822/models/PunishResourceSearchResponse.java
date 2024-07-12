// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class PunishResourceSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PunishResourceSearchResponseBody body;

    public static PunishResourceSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        PunishResourceSearchResponse self = new PunishResourceSearchResponse();
        return TeaModel.build(map, self);
    }

    public PunishResourceSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PunishResourceSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PunishResourceSearchResponse setBody(PunishResourceSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public PunishResourceSearchResponseBody getBody() {
        return this.body;
    }

}
