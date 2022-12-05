// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RestartCasterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestartCasterResponseBody body;

    public static RestartCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartCasterResponse self = new RestartCasterResponse();
        return TeaModel.build(map, self);
    }

    public RestartCasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartCasterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartCasterResponse setBody(RestartCasterResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartCasterResponseBody getBody() {
        return this.body;
    }

}
