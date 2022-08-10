// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class PauseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PauseInstanceResponseBody body;

    public static PauseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseInstanceResponse self = new PauseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public PauseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseInstanceResponse setBody(PauseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseInstanceResponseBody getBody() {
        return this.body;
    }

}
