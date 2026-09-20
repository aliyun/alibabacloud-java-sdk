// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AiTryOnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AiTryOnResponseBody body;

    public static AiTryOnResponse build(java.util.Map<String, ?> map) throws Exception {
        AiTryOnResponse self = new AiTryOnResponse();
        return TeaModel.build(map, self);
    }

    public AiTryOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AiTryOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AiTryOnResponse setBody(AiTryOnResponseBody body) {
        this.body = body;
        return this;
    }
    public AiTryOnResponseBody getBody() {
        return this.body;
    }

}
