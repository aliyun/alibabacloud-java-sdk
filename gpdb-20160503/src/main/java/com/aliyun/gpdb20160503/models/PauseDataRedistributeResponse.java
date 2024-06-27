// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class PauseDataRedistributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseDataRedistributeResponseBody body;

    public static PauseDataRedistributeResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseDataRedistributeResponse self = new PauseDataRedistributeResponse();
        return TeaModel.build(map, self);
    }

    public PauseDataRedistributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseDataRedistributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseDataRedistributeResponse setBody(PauseDataRedistributeResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseDataRedistributeResponseBody getBody() {
        return this.body;
    }

}
