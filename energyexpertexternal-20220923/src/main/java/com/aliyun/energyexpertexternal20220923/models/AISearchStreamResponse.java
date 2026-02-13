// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AISearchStreamResponseBody body;

    public static AISearchStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        AISearchStreamResponse self = new AISearchStreamResponse();
        return TeaModel.build(map, self);
    }

    public AISearchStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AISearchStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AISearchStreamResponse setBody(AISearchStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public AISearchStreamResponseBody getBody() {
        return this.body;
    }

}
