// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CloseSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseSessionResponseBody body;

    public static CloseSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseSessionResponse self = new CloseSessionResponse();
        return TeaModel.build(map, self);
    }

    public CloseSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseSessionResponse setBody(CloseSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseSessionResponseBody getBody() {
        return this.body;
    }

}
